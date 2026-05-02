package com.memorylane.ar.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.memorylane.ar.databinding.ActivityArRevealBinding

class ARRevealActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArRevealBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArRevealBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
