package com.memorylane.ar.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.memorylane.ar.databinding.ActivityPlantCapsuleBinding

class PlantCapsuleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlantCapsuleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlantCapsuleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
