package com.memorylane.ar

import android.app.Application
import org.osmdroid.config.Configuration

class MemoryLaneApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Configuration.getInstance().userAgentValue = packageName
    }
}
