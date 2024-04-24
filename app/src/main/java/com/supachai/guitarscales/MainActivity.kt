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

        //6th String F
        val buttonF_6th: Button = findViewById(R.id.button_f_6th)
        buttonF_6th.setOnClickListener {
            setupMediaPlayer(notesMap["F 6th"] ?: R.raw.f_6th)
            playNote()
        }

        //6th String F#
        val buttonFSharp_6th: Button = findViewById(R.id.button_f_sharp_6th)
        buttonFSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["F# 6th"] ?: R.raw.f_sharp_6th)
            playNote()
        }

        //6th String G
        val buttonG_6th: Button = findViewById(R.id.button_g_6th)
        buttonG_6th.setOnClickListener {
            setupMediaPlayer(notesMap["G 6th"] ?: R.raw.g_6th)
            playNote()
        }

        //6th String G#
        val buttonGSharp_6th: Button = findViewById(R.id.button_g_sharp_6th)
        buttonGSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["G# 6th"] ?: R.raw.g_sharp_6th)
            playNote()
        }

        //6th String A
        val buttonA_6th: Button = findViewById(R.id.button_a_6th)
        buttonA_6th.setOnClickListener {
            setupMediaPlayer(notesMap["A 6th"] ?: R.raw.a_6th)
            playNote()
        }

        //6th String A#
        val buttonASharp_6th: Button = findViewById(R.id.button_a_sharp_6th)
        buttonASharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["A# 6th"] ?: R.raw.a_sharp_6th)
            playNote()
        }

        //6th String B
        val buttonB_6th: Button = findViewById(R.id.button_b_6th)
        buttonB_6th.setOnClickListener {
            setupMediaPlayer(notesMap["B 6th"] ?: R.raw.b_6th)
            playNote()
        }

        //6th String C
        val buttonC_6th: Button = findViewById(R.id.button_c_6th)
        buttonC_6th.setOnClickListener {
            setupMediaPlayer(notesMap["C 6th"] ?: R.raw.c_6th)
            playNote()
        }

        //6th String C#
        val buttonCSharp_6th: Button = findViewById(R.id.button_c_sharp_6th)
        buttonCSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["C# 6th"] ?: R.raw.c_sharp_6th)
            playNote()
        }

        //6th String D
        val buttonD_6th: Button = findViewById(R.id.button_d_6th)
        buttonD_6th.setOnClickListener {
            setupMediaPlayer(notesMap["D 6th"] ?: R.raw.d_6th)
            playNote()
        }

        //6th String D#
        val buttonDSharp_6th: Button = findViewById(R.id.button_d_sharp_6th)
        buttonDSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["D# 6th"] ?: R.raw.d_sharp_6th)
            playNote()
        }

        //6th String E
        val buttonE_6th: Button = findViewById(R.id.button_e_6th)
        buttonE_6th.setOnClickListener {
            setupMediaPlayer(notesMap["D 6th"] ?: R.raw.e_6th)
            playNote()
        }

        //5th String A Open
        val buttonAOpen_5th: Button = findViewById(R.id.button_a_open_5th)
        buttonAOpen_5th.setOnClickListener {
            setupMediaPlayer(notesMap["A 5th Open"] ?: R.raw.a_5th_open)
            playNote()
        }

        //5th String A#
        val buttonASharp_5th: Button = findViewById(R.id.button_a_sharp_5th)
        buttonASharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["A# 5th"] ?: R.raw.a_sharp_5th)
            playNote()
        }

        //5th String B
        val buttonB_5th: Button = findViewById(R.id.button_b_5th)
        buttonB_5th.setOnClickListener {
            setupMediaPlayer(notesMap["B 5th"] ?: R.raw.b_5th)
            playNote()
        }

        //5th String C
        val buttonC_5th: Button = findViewById(R.id.button_c_5th)
        buttonC_5th.setOnClickListener {
            setupMediaPlayer(notesMap["C 5th"] ?: R.raw.c_5th)
            playNote()
        }

        //5th String C#
        val buttonCSharp_5th: Button = findViewById(R.id.button_c_sharp_5th)
        buttonCSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["C# 5th"] ?: R.raw.c_sharp_5th)
            playNote()
        }

        //5th String D
        val buttonD_5th: Button = findViewById(R.id.button_d_5th)
        buttonD_5th.setOnClickListener {
            setupMediaPlayer(notesMap["D 5th"] ?: R.raw.d_5th)
            playNote()
        }

        //5th String D#
        val buttonDSharp_5th: Button = findViewById(R.id.button_d_sharp_5th)
        buttonDSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["D# 5th"] ?: R.raw.d_sharp_5th)
            playNote()
        }

        //5th String E
        val buttonE_5th: Button = findViewById(R.id.button_e_5th)
        buttonE_5th.setOnClickListener {
            setupMediaPlayer(notesMap["E 5th"] ?: R.raw.e_5th)
            playNote()
        }

        //5th String F
        val buttonF_5th: Button = findViewById(R.id.button_f_5th)
        buttonF_5th.setOnClickListener {
            setupMediaPlayer(notesMap["F 5th"] ?: R.raw.f_5th)
            playNote()
        }

        //5th String F#
        val buttonFSharp_5th: Button = findViewById(R.id.button_f_sharp_5th)
        buttonFSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["F# 5th"] ?: R.raw.f_sharp_5th)
            playNote()
        }

        //5th string G
        val buttonG_5th: Button = findViewById(R.id.button_g_5th)
        buttonG_5th.setOnClickListener {
            setupMediaPlayer(notesMap["G 5th"] ?: R.raw.g_5th)
            playNote()
        }

        //5th string G#
        val buttonGSharp_5th: Button = findViewById(R.id.button_g_sharp_5th)
        buttonGSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["G# 5th"] ?: R.raw.g_sharp_5th)
            playNote()
        }

        //5th string A
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

        //4th string D#
        val buttonDSharp_4th: Button = findViewById(R.id.button_d_sharp_4th)
        buttonDSharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["D# 4th"] ?: R.raw.d_sharp_4th)
            playNote()
        }

        //4th string E
        val buttonE_4th: Button = findViewById(R.id.button_e_4th)
        buttonE_4th.setOnClickListener {
            setupMediaPlayer(notesMap["E 4th"] ?: R.raw.e_4th)
            playNote()
        }

        //4th string F
        val buttonF_4th: Button = findViewById(R.id.button_f_4th)
        buttonF_4th.setOnClickListener {
            setupMediaPlayer(notesMap["F 4th"] ?: R.raw.f_4th)
            playNote()
        }

        //4th string F sharp
        val buttonFSharp_4th: Button = findViewById(R.id.button_f_sharp_4th)
        buttonFSharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["F# 4th"] ?: R.raw.f_sharp_4th)
            playNote()
        }

        //4th string G
        val buttonG_4th: Button = findViewById(R.id.button_g_4th)
        buttonG_4th.setOnClickListener {
            setupMediaPlayer(notesMap["G 4th"] ?: R.raw.g_4th)
            playNote()
        }

        //4th string G#
        val buttonGSharp_4th: Button = findViewById(R.id.button_g_sharp_4th)
        buttonGSharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["G# 4th"] ?: R.raw.g_sharp_4th)
            playNote()
        }

        //4th string A
        val buttonA_4th: Button = findViewById(R.id.button_a_4th)
        buttonA_4th.setOnClickListener {
            setupMediaPlayer(notesMap["A 4th"] ?: R.raw.a_4th)
            playNote()
        }

        //4th string A#
        val buttonASharp_4th: Button = findViewById(R.id.button_a_sharp_4th)
        buttonASharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["A# 4th"] ?: R.raw.a_sharp_4th)
            playNote()
        }

        //4th string B
        val buttonB_4th: Button = findViewById(R.id.button_b_4th)
        buttonB_4th.setOnClickListener {
            setupMediaPlayer(notesMap["B 4th"] ?: R.raw.b_4th)
            playNote()
        }

        //4th string C
        val buttonC_4th: Button = findViewById(R.id.button_c_4th)
        buttonC_4th.setOnClickListener {
            setupMediaPlayer(notesMap["C 4th"] ?: R.raw.c_4th)
            playNote()
        }

        //4th string C#
        val buttonCSharp_4th: Button = findViewById(R.id.button_c_sharp_4th)
        buttonCSharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["C# 4th"] ?: R.raw.c_sharp_4th)
            playNote()
        }

        //4th string C#
        val buttonD_4th: Button = findViewById(R.id.button_d_4th)
        buttonD_4th.setOnClickListener {
            setupMediaPlayer(notesMap["D 4th"] ?: R.raw.d_4th)
            playNote()
        }

        //3rd string G open
        val buttonGOpen_3rd: Button = findViewById(R.id.button_g_3rd_open)
        buttonGOpen_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["G 3rd Open"] ?: R.raw.g_3rd_open)
            playNote()
        }

        //3rd string G#
        val buttonGSharp_3rd: Button = findViewById(R.id.button_g_sharp_3rd)
        buttonGSharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["G# 3rd"] ?: R.raw.g_sharp_3rd)
            playNote()
        }

        //3rd string A
        val buttonA_3rd: Button = findViewById(R.id.button_a_3rd)
        buttonA_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["A 3rd"] ?: R.raw.a_3rd)
            playNote()
        }

        //3rd string A#
        val buttonASharp_3rd: Button = findViewById(R.id.button_a_sharp_3rd)
        buttonASharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["A# 3rd"] ?: R.raw.a_sharp_3rd)
            playNote()
        }

        //3rd string B
        val buttonB_3rd: Button = findViewById(R.id.button_b_3rd)
        buttonB_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["B 3rd"] ?: R.raw.b_3rd)
            playNote()
        }

        //3rd string C
        val buttonC_3rd: Button = findViewById(R.id.button_c_3rd)
        buttonC_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["C 3rd"] ?: R.raw.c_3rd)
            playNote()
        }

        //3rd string C#
        val buttonCSharp_3rd: Button = findViewById(R.id.button_c_sharp_3rd)
        buttonCSharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["C# 3rd"] ?: R.raw.c_sharp_3rd)
            playNote()
        }

        //3rd string D
        val buttonD_3rd: Button = findViewById(R.id.button_d_3rd)
        buttonD_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["D 3rd"] ?: R.raw.d_3rd)
            playNote()
        }

        //3rd string D#
        val buttonDSharp_3rd: Button = findViewById(R.id.button_d_sharp_3rd)
        buttonDSharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["D# 3rd"] ?: R.raw.d_sharp_3rd)
            playNote()
        }

        //3rd string E
        val buttonE_3rd: Button = findViewById(R.id.button_e_3rd)
        buttonE_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["E 3rd"] ?: R.raw.e_3rd)
            playNote()
        }

        //3rd string F
        val buttonF_3rd: Button = findViewById(R.id.button_f_3rd)
        buttonF_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["F 3rd"] ?: R.raw.f_3rd)
            playNote()
        }

        //3rd string F#
        val buttonFSharp_3rd: Button = findViewById(R.id.button_f_sharp_3rd)
        buttonFSharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["F# 3rd"] ?: R.raw.f_sharp_3rd)
            playNote()
        }

        //3rd string G
        val buttonG_3rd: Button = findViewById(R.id.button_g_3rd)
        buttonG_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["F# 3rd"] ?: R.raw.g_3rd)
            playNote()
        }

        //2nd string B Open String
        val buttonBOpen_2nd: Button = findViewById(R.id.button_b_2nd_open)
        buttonBOpen_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["B 2nd Open"] ?: R.raw.b_2nd_open)
            playNote()
        }

        //2nd string C
        val buttonC_2nd: Button = findViewById(R.id.button_c_2nd)
        buttonC_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["C 2nd"] ?: R.raw.c_2nd)
            playNote()
        }

        //2nd string C#
        val buttonCSharp_2nd: Button = findViewById(R.id.button_c_sharp_2nd)
        buttonCSharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["C# 2nd"] ?: R.raw.c_sharp_2nd)
            playNote()
        }

        //2nd string D
        val buttonD_2nd: Button = findViewById(R.id.button_d_2nd)
        buttonD_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["D 2nd"] ?: R.raw.d_2nd)
            playNote()
        }

        //2nd string D#
        val buttonDSharp_2nd: Button = findViewById(R.id.button_d_sharp_2nd)
        buttonDSharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["D# 2nd"] ?: R.raw.d_sharp_2nd)
            playNote()
        }

        //2nd string E
        val buttonE_2nd: Button = findViewById(R.id.button_e_2nd)
        buttonE_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["D# 2nd"] ?: R.raw.e_2nd)
            playNote()
        }

        //2nd string F
        val buttonF_2nd: Button = findViewById(R.id.button_f_2nd)
        buttonF_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["F 2nd"] ?: R.raw.f_2nd)
            playNote()
        }

        //2nd string F#
        val buttonFSharp_2nd: Button = findViewById(R.id.button_f_sharp_2nd)
        buttonFSharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["F# 2nd"] ?: R.raw.f_sharp_2nd)
            playNote()
        }

        //2nd string G
        val buttonG_2nd: Button = findViewById(R.id.button_g_2nd)
        buttonG_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["G 2nd"] ?: R.raw.g_2nd)
            playNote()
        }

        //2nd string G#
        val buttonGSharp_2nd: Button = findViewById(R.id.button_g_sharp_2nd)
        buttonGSharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["G# 2nd"] ?: R.raw.g_sharp_2nd)
            playNote()
        }

        //2nd string A
        val buttonA_2nd: Button = findViewById(R.id.button_a_2nd)
        buttonA_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["A 2nd"] ?: R.raw.a_2nd)
            playNote()
        }

        //2nd string A#
        val buttonASharp_2nd: Button = findViewById(R.id.button_a_sharp_2nd)
        buttonASharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["A# 2nd"] ?: R.raw.a_sharp_2nd)
            playNote()
        }

        //2nd string B
        val buttonB_2nd: Button = findViewById(R.id.button_b_2nd)
        buttonB_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["B 2nd"] ?: R.raw.b_2nd)
            playNote()
        }

        //1st string E Open
        val buttonEOpen_1st: Button = findViewById(R.id.button_e_1st_open)
        buttonEOpen_1st.setOnClickListener {
            setupMediaPlayer(notesMap["E 1st Open"] ?: R.raw.e_1st_open)
            playNote()
        }

        //1st string F
        val buttonF_1st: Button = findViewById(R.id.button_f_1st)
        buttonF_1st.setOnClickListener {
            setupMediaPlayer(notesMap["F 1st"] ?: R.raw.f_1st)
            playNote()
        }

        //1st string F#
        val buttonFSharp_1st: Button = findViewById(R.id.button_f_sharp_1st)
        buttonFSharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["F# 1st"] ?: R.raw.f_sharp_1st)
            playNote()
        }

        //1st string G
        val buttonG_1st: Button = findViewById(R.id.button_g_1st)
        buttonG_1st.setOnClickListener {
            setupMediaPlayer(notesMap["G 1st"] ?: R.raw.g_1st)
            playNote()
        }

        //1st string G#
        val buttonGSharp_1st: Button = findViewById(R.id.button_g_sharp_1st)
        buttonGSharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["G# 1st"] ?: R.raw.g_sharp_1st)
            playNote()
        }

        //1st string A
        val buttonA_1st: Button = findViewById(R.id.button_a_1st)
        buttonA_1st.setOnClickListener {
            setupMediaPlayer(notesMap["A 1st"] ?: R.raw.a_1st)
            playNote()
        }

        //1st string A#
        val buttonASharp_1st: Button = findViewById(R.id.button_a_sharp_1st)
        buttonASharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["A# 1st"] ?: R.raw.a_sharp_1st)
            playNote()
        }

        //1st string B
        val buttonB_1st: Button = findViewById(R.id.button_b_1st)
        buttonB_1st.setOnClickListener {
            setupMediaPlayer(notesMap["B 1st"] ?: R.raw.b_1st)
            playNote()
        }

        //1st string C
        val buttonC_1st: Button = findViewById(R.id.button_c_1st)
        buttonC_1st.setOnClickListener {
            setupMediaPlayer(notesMap["C 1st"] ?: R.raw.c_1st)
            playNote()
        }

        //1st string C#
        val buttonCSharp_1st: Button = findViewById(R.id.button_c_sharp_1st)
        buttonCSharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["C# 1st"] ?: R.raw.c_sharp_1st)
            playNote()
        }

        //1st string D
        val buttonD_1st: Button = findViewById(R.id.button_d_1st)
        buttonD_1st.setOnClickListener {
            setupMediaPlayer(notesMap["D 1st"] ?: R.raw.d_1st)
            playNote()
        }

        //1st string D#
        val buttonDSharp_1st: Button = findViewById(R.id.button_d_sharp_1st)
        buttonDSharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["D# 1st"] ?: R.raw.d_sharp_1st)
            playNote()
        }

        //1st string E
        val buttonE_1st: Button = findViewById(R.id.button_e_1st)
        buttonE_1st.setOnClickListener {
            setupMediaPlayer(notesMap["E 1st"] ?: R.raw.e_1st)
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