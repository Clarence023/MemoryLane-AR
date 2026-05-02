package com.memorylane.ar.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CapsuleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(capsule: Capsule)

    @Query("SELECT * FROM capsules ORDER BY createdAtEpochMs DESC")
    fun observeInbox(): Flow<List<Capsule>>
}
