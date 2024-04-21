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
        val buttonE: Button = findViewById(R.id.button_e_6th_open)
        buttonE.setOnClickListener {
            setupMediaPlayer(notesMap["E"] ?: R.raw.e_6th_open)
            playNote()
        }

        val buttonF: Button = findViewById(R.id.button_f_6th)
        buttonF.setOnClickListener {
            setupMediaPlayer(notesMap["E"] ?: R.raw.f_6th)
            playNote()
        }

        val buttonFsharp: Button = findViewById(R.id.button_f_sharp_6th)
        buttonFsharp.setOnClickListener {
            setupMediaPlayer(notesMap["E"] ?: R.raw.f_sharp_6th)
            playNote()
        }
    }

    private fun getNotesForScale(scale: String): Map<String, Int> {
        // Return a map of note labels to raw resource IDs
        return when (scale) {
            "Major" -> mapOf("E" to R.raw.e_6th_open, "F" to R.raw.f_6th) // Example mapping
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