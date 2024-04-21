package com.supachai.guitarscales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.view.View
import android.widget.AdapterView
import android.media.MediaPlayer
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    private fun setupMediaPlayer(noteResourceId: Int) {
        mediaPlayer?.release() // Release any previously playing player
        mediaPlayer = MediaPlayer.create(this, noteResourceId)
    }

    private fun playNote() {
        mediaPlayer?.start()
    }

    private fun setupButtonNotes(scale: String) {
        val notesMap = getNotesForScale(scale)
        val buttonE_6th: Button = findViewById(R.id.button_e_6th_open)
        buttonE_6th.setOnClickListener {
            setupMediaPlayer(notesMap["E"] ?: R.raw.e_6th_open)
            playNote()
        }

        val buttonF_6th: Button = findViewById(R.id.button_f_6th)
        buttonF_6th.setOnClickListener {
            setupMediaPlayer(notesMap["F"] ?: R.raw.f_6th)
            playNote()
        }

        val buttonFSharp_6th: Button = findViewById(R.id.button_f_sharp_6th)
        buttonFSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["F"] ?: R.raw.f_sharp_6th)
            playNote()
        }

        val buttonG_6th: Button = findViewById(R.id.button_g_6th)
        buttonG_6th.setOnClickListener {
            setupMediaPlayer(notesMap["G"] ?: R.raw.g_6th)
            playNote()
        }

        val buttonGSharp_6th: Button = findViewById(R.id.button_g_sharp_6th)
        buttonGSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["G#"] ?: R.raw.g_sharp_6th)
            playNote()
        }

        val buttonA_6th: Button = findViewById(R.id.button_a_6th)
        buttonA_6th.setOnClickListener {
            setupMediaPlayer(notesMap["A"] ?: R.raw.a_6th)
            playNote()
        }

        val buttonASharp_6th: Button = findViewById(R.id.button_a_sharp_6th)
        buttonASharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["A#"] ?: R.raw.a_sharp_6th)
            playNote()
        }

        val buttonB_6th: Button = findViewById(R.id.button_b_6th)
        buttonB_6th.setOnClickListener {
            setupMediaPlayer(notesMap["B"] ?: R.raw.b_6th)
            playNote()
        }

        val buttonC_6th: Button = findViewById(R.id.button_c_6th)
        buttonC_6th.setOnClickListener {
            setupMediaPlayer(notesMap["C"] ?: R.raw.c_6th)
            playNote()
        }
    }

    private fun getNotesForScale(scale: String): Map<String, Int> {
        // Return a map of note labels to raw resource IDs
        return when (scale) {
            "Major" -> mapOf("E" to R.raw.e_6th_open, "F" to R.raw.f_6th,
                "F#" to R.raw.f_sharp_6th, "G" to R.raw.g_6th, "G#" to R.raw.g_sharp_6th,
                "A" to R.raw.a_6th, "B" to R.raw.b_6th, "C" to R.raw.c_6th)
            else -> emptyMap()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Existing setup code...

        // Setup for Spinner
        val scaleSpinner: Spinner = findViewById(R.id.scaleSpinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.guitar_scales_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            scaleSpinner.adapter = adapter
        }

        // Set an item selected listener for the spinner
        scaleSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedScale = parent.getItemAtPosition(position).toString()
                // Here, implement code to update UI based on selected scale
                updateScale(selectedScale)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Implement code if necessary
            }
        }
    }

    private fun updateScale(scale: String) {
        // Implement your scale changing logic here
        // This could involve updating the visible notes, changing button labels, etc.
        setupButtonNotes(scale)
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}