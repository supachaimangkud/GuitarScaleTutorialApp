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

        //6th String open string
        val buttonEOpen_6th: Button = findViewById(R.id.button_e_6th_open)
        buttonEOpen_6th.setOnClickListener {
            setupMediaPlayer(notesMap["E 6th open"] ?: R.raw.e_6th_open)
            playNote()
        }

        //6th String 1st fret
        val buttonF_6th: Button = findViewById(R.id.button_f_6th)
        buttonF_6th.setOnClickListener {
            setupMediaPlayer(notesMap["F 6th"] ?: R.raw.f_6th)
            playNote()
        }

        ////6th String 2nd fret
        val buttonFSharp_6th: Button = findViewById(R.id.button_f_sharp_6th)
        buttonFSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["F# 6th"] ?: R.raw.f_sharp_6th)
            playNote()
        }

        val buttonG_6th: Button = findViewById(R.id.button_g_6th)
        buttonG_6th.setOnClickListener {
            setupMediaPlayer(notesMap["G 6th"] ?: R.raw.g_6th)
            playNote()
        }

        val buttonGSharp_6th: Button = findViewById(R.id.button_g_sharp_6th)
        buttonGSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["G# 6th"] ?: R.raw.g_sharp_6th)
            playNote()
        }

        val buttonA_6th: Button = findViewById(R.id.button_a_6th)
        buttonA_6th.setOnClickListener {
            setupMediaPlayer(notesMap["A 6th"] ?: R.raw.a_6th)
            playNote()
        }

        val buttonASharp_6th: Button = findViewById(R.id.button_a_sharp_6th)
        buttonASharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["A# 6th"] ?: R.raw.a_sharp_6th)
            playNote()
        }

        val buttonB_6th: Button = findViewById(R.id.button_b_6th)
        buttonB_6th.setOnClickListener {
            setupMediaPlayer(notesMap["B 6th"] ?: R.raw.b_6th)
            playNote()
        }

        val buttonC_6th: Button = findViewById(R.id.button_c_6th)
        buttonC_6th.setOnClickListener {
            setupMediaPlayer(notesMap["C 6th"] ?: R.raw.c_6th)
            playNote()
        }

        val buttonCSharp_6th: Button = findViewById(R.id.button_c_sharp_6th)
        buttonCSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["C# 6th"] ?: R.raw.c_sharp_6th)
            playNote()
        }

        val buttonD_6th: Button = findViewById(R.id.button_d_6th)
        buttonD_6th.setOnClickListener {
            setupMediaPlayer(notesMap["D 6th"] ?: R.raw.d_6th)
            playNote()
        }

        val buttonDSharp_6th: Button = findViewById(R.id.button_d_sharp_6th)
        buttonDSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["D# 6th"] ?: R.raw.d_sharp_6th)
            playNote()
        }

        val buttonE_6th: Button = findViewById(R.id.button_e_6th)
        buttonE_6th.setOnClickListener {
            setupMediaPlayer(notesMap["D 6th"] ?: R.raw.e_6th)
            playNote()
        }

        val buttonAOpen_5th: Button = findViewById(R.id.button_a_open_5th)
        buttonAOpen_5th.setOnClickListener {
            setupMediaPlayer(notesMap["A 5th Open"] ?: R.raw.a_5th_open)
            playNote()
        }

        val buttonASharp_5th: Button = findViewById(R.id.button_a_sharp_5th)
        buttonASharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["A# 5th"] ?: R.raw.a_sharp_5th)
            playNote()
        }

        val buttonB_5th: Button = findViewById(R.id.button_b_5th)
        buttonB_5th.setOnClickListener {
            setupMediaPlayer(notesMap["B 5th"] ?: R.raw.b_5th)
            playNote()
        }

        val buttonC_5th: Button = findViewById(R.id.button_c_5th)
        buttonC_5th.setOnClickListener {
            setupMediaPlayer(notesMap["C 5th"] ?: R.raw.c_5th)
            playNote()
        }

        val buttonCSharp_5th: Button = findViewById(R.id.button_c_sharp_5th)
        buttonCSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["C# 5th"] ?: R.raw.c_sharp_5th)
            playNote()
        }

        val buttonD_5th: Button = findViewById(R.id.button_d_5th)
        buttonD_5th.setOnClickListener {
            setupMediaPlayer(notesMap["D 5th"] ?: R.raw.d_5th)
            playNote()
        }

        val buttonDSharp_5th: Button = findViewById(R.id.button_d_sharp_5th)
        buttonDSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["D# 5th"] ?: R.raw.d_sharp_5th)
            playNote()
        }

        val buttonE_5th: Button = findViewById(R.id.button_e_5th)
        buttonE_5th.setOnClickListener {
            setupMediaPlayer(notesMap["E 5th"] ?: R.raw.e_5th)
            playNote()
        }

        val buttonF_5th: Button = findViewById(R.id.button_f_5th)
        buttonF_5th.setOnClickListener {
            setupMediaPlayer(notesMap["F 5th"] ?: R.raw.f_5th)
            playNote()
        }

        val buttonFSharp_5th: Button = findViewById(R.id.button_f_sharp_5th)
        buttonFSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["F# 5th"] ?: R.raw.f_sharp_5th)
            playNote()
        }

        val buttonG_5th: Button = findViewById(R.id.button_g_5th)
        buttonG_5th.setOnClickListener {
            setupMediaPlayer(notesMap["G 5th"] ?: R.raw.g_5th)
            playNote()
        }

        //5th string 11th fret
        val buttonGSharp_5th: Button = findViewById(R.id.button_g_sharp_5th)
        buttonGSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["G# 5th"] ?: R.raw.g_sharp_5th)
            playNote()
        }

        //5th string 12th fret
        val buttonA_5th: Button = findViewById(R.id.button_a_5th)
        buttonA_5th.setOnClickListener {
            setupMediaPlayer(notesMap["A 5th"] ?: R.raw.a_5th)
            playNote()
        }


        //4th string d open string
        val buttonDOpen_4th: Button = findViewById(R.id.button_d_open_4th)
        buttonDOpen_4th.setOnClickListener {
            setupMediaPlayer(notesMap["D 4th Open"] ?: R.raw.d_4th_open)
            playNote()
        }

        //4th string d open string
        val buttonDSharp_4th: Button = findViewById(R.id.button_d_sharp_4th)
        buttonDSharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["D# 4th"] ?: R.raw.d_sharp_4th)
            playNote()
        }

        //4th string d open string
        val buttonE_4th: Button = findViewById(R.id.button_e_4th)
        buttonE_4th.setOnClickListener {
            setupMediaPlayer(notesMap["E 4th"] ?: R.raw.e_4th)
            playNote()
        }


    }

    private fun getNotesForScale(scale: String): Map<String, Int> {
        // Return a map of note labels to raw resource IDs
        return when (scale) {
            "Major" -> mapOf("E open" to R.raw.e_6th_open, "F" to R.raw.f_6th,
                "F#" to R.raw.f_sharp_6th, "G" to R.raw.g_6th, "G#" to R.raw.g_sharp_6th,
                "A" to R.raw.a_6th, "B" to R.raw.b_6th, "C" to R.raw.c_6th, "C#" to R.raw.c_sharp_6th,
                "D" to R.raw.d_6th, "D#" to R.raw.d_sharp_6th, "E" to R.raw.e_6th)
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