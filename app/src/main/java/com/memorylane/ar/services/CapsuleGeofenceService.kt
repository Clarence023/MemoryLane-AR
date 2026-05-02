package com.memorylane.ar.services

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.IBinder

class CapsuleGeofenceService : Service() {
    override fun onCreate() {
        super.onCreate()
        val manager = getSystemService(NotificationManager::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            manager.createNotificationChannel(
                NotificationChannel(CHANNEL_ID, "MemoryLane Geofence", NotificationManager.IMPORTANCE_LOW)
            )
        }
        startForeground(42, Notification.Builder(this, CHANNEL_ID)
            .setContentTitle("MemoryLane AR")
            .setContentText("Monitoring nearby capsules offline")
            .setSmallIcon(android.R.drawable.ic_menu_mylocation)
            .build())
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int = START_STICKY
    override fun onBind(intent: Intent?): IBinder? = null

    companion object { const val CHANNEL_ID = "memorylane_geofence" }
}
