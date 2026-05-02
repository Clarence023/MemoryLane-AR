package com.memorylane.ar.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class GeofenceBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // TODO: parse GeofencingEvent, update capsule status, trigger haptics + local notification.
    }
}
