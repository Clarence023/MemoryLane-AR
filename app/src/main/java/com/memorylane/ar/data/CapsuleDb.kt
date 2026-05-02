package com.memorylane.ar.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters

@Database(entities = [Capsule::class], version = 1, exportSchema = false)
@TypeConverters(CapsuleConverters::class)
abstract class CapsuleDb : RoomDatabase() {
    abstract fun capsuleDao(): CapsuleDao
}

class CapsuleConverters {
    @TypeConverter
    fun toType(value: String): CapsuleType = CapsuleType.valueOf(value)

    @TypeConverter
    fun fromType(value: CapsuleType): String = value.name

    @TypeConverter
    fun toStatus(value: String): CapsuleStatus = CapsuleStatus.valueOf(value)

    @TypeConverter
    fun fromStatus(value: CapsuleStatus): String = value.name
}
