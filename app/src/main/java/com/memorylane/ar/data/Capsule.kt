package com.memorylane.ar.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "capsules")
data class Capsule(
    @PrimaryKey val id: String,
    val title: String,
    val note: String,
    val type: CapsuleType,
    val latitude: Double,
    val longitude: Double,
    val altitude: Double,
    val bearing: Float,
    val unlockAtEpochMs: Long?,
    val expiresAtEpochMs: Long?,
    val mediaPath: String?,
    val recipientHash: String,
    val status: CapsuleStatus,
    val createdAtEpochMs: Long,
)

enum class CapsuleType { TEXT, PHOTO, VIDEO, VOICE }
enum class CapsuleStatus { LOCKED, NEARBY, READY, OPENED, EXPIRED }
