package com.supachai.guitarscales

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.AdapterView
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AlertDialog
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    //use for playing mp3 file that is corresponding to each button
    private var mediaPlayer: MediaPlayer? = null

    // List to keep track of played notes
    private var notesPlayed = mutableListOf<String>()

    //currentScale will be initialized later base on scale that user has selected
    private lateinit var currentScale: String

    //list of notes that corresponding to each scale
    private val correctSequences: Map<String, List<String>> = mapOf(
        "C Major Scale" to listOf("C 5th","D 4th Open","E 4th","F 4th","G 3rd Open","A 3rd",
            "B 2nd Open", "C 2nd","D 2nd","E 1st Open", "F 1st", "G 1st", "F 1st", "E 1st Open",
            "D 2nd","C 2nd","B 2nd Open", "A 3rd", "G 3rd Open", "F 4th", "E 4th", "D 4th Open",
            "C 5th", "B 5th", "A 5th Open", "G 6th", "F 6th", "E 6th Open", "F 6th", "G 6th",
            "A 5th Open", "B 5th", "C 5th"),

        "E Minor Pentatonic" to listOf("E 4th", "G 3rd Open", "A 3rd", "B 2nd Open", "D 2nd",
            "E 1st Open", "G 1st", "E 1st Open", "D 2nd", "B 2nd Open", "A 3rd", "G 3rd Open",
            "E 4th", "D 4th Open", "B 5th", "A 5th Open", "G 6th", "E 6th Open", "G 6th",
            "A 5th Open", "C 5th", "D 4th Open", "E 4th"),

        "A Minor Pentatonic" to listOf("A 3rd", "C 2nd","D 2nd", "E 1st Open", "G 1st",
            "E 1st Open", "D 2nd", "C 2nd", "A 3rd", "G 3rd Open", "E 4th", "D 4th Open", "C 5th",
            "A 5th Open", "G 6th", "E 6th Open", "G 6th", "A 5th Open", "C 5th", "D 4th Open",
            "E 4th", "G 3rd Open", "A 3rd"),

        "G Major Scale" to listOf("G 6th", "A 5th Open", "B 5th", "C 5th", "D 4th Open", "E 4th",
            "F# 4th","G 3rd Open", "A 3rd", "B 2nd Open","C 2nd", "D 2nd", "E 1st Open",
            "F# 1st", "G 1st", "F# 1st", "E 1st Open", "D 2nd", "C 2nd", "B 2nd Open", "A 3rd",
            "G 3rd Open", "F# 4th", "E 4th", "D 4th Open", "C 5th", "B 5th", "A 5th Open", "G 6th",
            "F# 6th", "E 6th Open", "F# 6th", "G 6th"),

        "E Harmonic Minor" to listOf("E 4th", "F# 4th", "G 3rd Open", "A 3rd", "B 2nd Open",
            "C 2nd","D 2nd", "E 1st Open", "G 1st", "E 1st Open", "D 2nd", "C 2nd", "B 2nd Open",
            "A 3rd", "G 3rd Open",  "F# 4th", "E 4th", "D 5th","C 5th", "B 5th", "A 5th Open",
            "G 6th", "E 6th Open" , "G 6th", "A 5th Open","B 5th" ,"C 5th" , "D 5th", "E 4th")
        // Add more scales with their correct sequences
    )

    //this function is used to play mpe files
    private fun setupMediaPlayer(noteResourceId: Int) {
        mediaPlayer?.release() // Release any previously playing player
        mediaPlayer = MediaPlayer.create(this, noteResourceId)
    }

    private fun playNote() {
        mediaPlayer?.start()
    }

    //this use to make button play notes that is corresponding to its mp3 files
    private fun setupButtonNotes(scale: String) {


        val notesMap = getNotesForScale(scale)

        //6th String open string
        val buttonEOpen_6th: Button = findViewById(R.id.button_e_6th_open)
        buttonEOpen_6th.setOnClickListener {
            setupMediaPlayer(notesMap["E 6th Open"] ?: R.raw.e_6th_open)
            playNote()
            notesPlayed.add("E 6th Open")  // Record the note played
        }

        //6th String F
        val buttonF_6th: Button = findViewById(R.id.button_f_6th)
        buttonF_6th.setOnClickListener {
            setupMediaPlayer(notesMap["F 6th"] ?: R.raw.f_6th)
            playNote()
            notesPlayed.add("F 6th")  // Record the note played
        }

        //6th String F#
        val buttonFSharp_6th: Button = findViewById(R.id.button_f_sharp_6th)
        buttonFSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["F# 6th"] ?: R.raw.f_sharp_6th)
            playNote()
            notesPlayed.add("F# 6th")  // Record the note played
        }

        //6th String G
        val buttonG_6th: Button = findViewById(R.id.button_g_6th)
        buttonG_6th.setOnClickListener {
            setupMediaPlayer(notesMap["G 6th"] ?: R.raw.g_6th)
            playNote()
            notesPlayed.add("G 6th")  // Record the note played
        }

        //6th String G#
        val buttonGSharp_6th: Button = findViewById(R.id.button_g_sharp_6th)
        buttonGSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["G# 6th"] ?: R.raw.g_sharp_6th)
            playNote()
            notesPlayed.add("G# 6th")  // Record the note played
        }

        //6th String A
        val buttonA_6th: Button = findViewById(R.id.button_a_6th)
        buttonA_6th.setOnClickListener {
            setupMediaPlayer(notesMap["A 6th"] ?: R.raw.a_6th)
            playNote()
            notesPlayed.add("A 6th")  // Record the note played
        }

        //6th String A#
        val buttonASharp_6th: Button = findViewById(R.id.button_a_sharp_6th)
        buttonASharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["A# 6th"] ?: R.raw.a_sharp_6th)
            playNote()
            notesPlayed.add("A# 6th")  // Record the note played
        }

        //6th String B
        val buttonB_6th: Button = findViewById(R.id.button_b_6th)
        buttonB_6th.setOnClickListener {
            setupMediaPlayer(notesMap["B 6th"] ?: R.raw.b_6th)
            playNote()
            notesPlayed.add("B 6th")  // Record the note played
        }

        //6th String C
        val buttonC_6th: Button = findViewById(R.id.button_c_6th)
        buttonC_6th.setOnClickListener {
            setupMediaPlayer(notesMap["C 6th"] ?: R.raw.c_6th)
            playNote()
            notesPlayed.add("C 6th")  // Record the note played
        }

        //6th String C#
        val buttonCSharp_6th: Button = findViewById(R.id.button_c_sharp_6th)
        buttonCSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["C# 6th"] ?: R.raw.c_sharp_6th)
            playNote()
            notesPlayed.add("C# 6th")  // Record the note played
        }

        //6th String D
        val buttonD_6th: Button = findViewById(R.id.button_d_6th)
        buttonD_6th.setOnClickListener {
            setupMediaPlayer(notesMap["D 6th"] ?: R.raw.d_6th)
            playNote()
            notesPlayed.add("D 6th")  // Record the note played
        }

        //6th String D#
        val buttonDSharp_6th: Button = findViewById(R.id.button_d_sharp_6th)
        buttonDSharp_6th.setOnClickListener {
            setupMediaPlayer(notesMap["D# 6th"] ?: R.raw.d_sharp_6th)
            playNote()
            notesPlayed.add("D# 6th")  // Record the note played
        }

        //6th String E
        val buttonE_6th: Button = findViewById(R.id.button_e_6th)
        buttonE_6th.setOnClickListener {
            setupMediaPlayer(notesMap["D 6th"] ?: R.raw.e_6th)
            playNote()
            notesPlayed.add("E 6th")  // Record the note played
        }

        //5th String A Open
        val buttonAOpen_5th: Button = findViewById(R.id.button_a_open_5th)
        buttonAOpen_5th.setOnClickListener {
            setupMediaPlayer(notesMap["A 5th Open"] ?: R.raw.a_5th_open)
            playNote()
            notesPlayed.add("A 5th Open")  // Record the note played
        }

        //5th String A#
        val buttonASharp_5th: Button = findViewById(R.id.button_a_sharp_5th)
        buttonASharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["A# 5th"] ?: R.raw.a_sharp_5th)
            playNote()
            notesPlayed.add("A# 5th")  // Record the note played
        }

        //5th String B
        val buttonB_5th: Button = findViewById(R.id.button_b_5th)
        buttonB_5th.setOnClickListener {
            setupMediaPlayer(notesMap["B 5th"] ?: R.raw.b_5th)
            playNote()
            notesPlayed.add("B 5th")  // Record the note played
        }

        //5th String C
        val buttonC_5th: Button = findViewById(R.id.button_c_5th)
        buttonC_5th.setOnClickListener {
            setupMediaPlayer(notesMap["C 5th"] ?: R.raw.c_5th)
            playNote()
            notesPlayed.add("C 5th")  // Record the note played
        }

        //5th String C#
        val buttonCSharp_5th: Button = findViewById(R.id.button_c_sharp_5th)
        buttonCSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["C# 5th"] ?: R.raw.c_sharp_5th)
            playNote()
            notesPlayed.add("C# 5th")  // Record the note played
        }

        //5th String D
        val buttonD_5th: Button = findViewById(R.id.button_d_5th)
        buttonD_5th.setOnClickListener {
            setupMediaPlayer(notesMap["D 5th"] ?: R.raw.d_5th)
            playNote()
            notesPlayed.add("D 5th")  // Record the note played
        }

        //5th String D#
        val buttonDSharp_5th: Button = findViewById(R.id.button_d_sharp_5th)
        buttonDSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["D# 5th"] ?: R.raw.d_sharp_5th)
            playNote()
            notesPlayed.add("D# 5th")  // Record the note played
        }

        //5th String E
        val buttonE_5th: Button = findViewById(R.id.button_e_5th)
        buttonE_5th.setOnClickListener {
            setupMediaPlayer(notesMap["E 5th"] ?: R.raw.e_5th)
            playNote()
            notesPlayed.add("E 5th")  // Record the note played
        }

        //5th String F
        val buttonF_5th: Button = findViewById(R.id.button_f_5th)
        buttonF_5th.setOnClickListener {
            setupMediaPlayer(notesMap["F 5th"] ?: R.raw.f_5th)
            playNote()
            notesPlayed.add("F 5th")  // Record the note played
        }

        //5th String F#
        val buttonFSharp_5th: Button = findViewById(R.id.button_f_sharp_5th)
        buttonFSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["F# 5th"] ?: R.raw.f_sharp_5th)
            playNote()
            notesPlayed.add("F# 5th")  // Record the note played
        }

        //5th string G
        val buttonG_5th: Button = findViewById(R.id.button_g_5th)
        buttonG_5th.setOnClickListener {
            setupMediaPlayer(notesMap["G 5th"] ?: R.raw.g_5th)
            playNote()
            notesPlayed.add("G 5th")  // Record the note played
        }

        //5th string G#
        val buttonGSharp_5th: Button = findViewById(R.id.button_g_sharp_5th)
        buttonGSharp_5th.setOnClickListener {
            setupMediaPlayer(notesMap["G# 5th"] ?: R.raw.g_sharp_5th)
            playNote()
            notesPlayed.add("G# 5th")  // Record the note played
        }

        //5th string A
        val buttonA_5th: Button = findViewById(R.id.button_a_5th)
        buttonA_5th.setOnClickListener {
            setupMediaPlayer(notesMap["A 5th"] ?: R.raw.a_5th)
            playNote()
            notesPlayed.add("A 5th")  // Record the note played
        }


        //4th string d open string
        val buttonDOpen_4th: Button = findViewById(R.id.button_d_open_4th)
        buttonDOpen_4th.setOnClickListener {
            setupMediaPlayer(notesMap["D 4th Open"] ?: R.raw.d_4th_open)
            playNote()
            notesPlayed.add("D 4th Open")  // Record the note played
        }

        //4th string D#
        val buttonDSharp_4th: Button = findViewById(R.id.button_d_sharp_4th)
        buttonDSharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["D# 4th"] ?: R.raw.d_sharp_4th)
            playNote()
            notesPlayed.add("D# 4th")  // Record the note played
        }

        //4th string E
        val buttonE_4th: Button = findViewById(R.id.button_e_4th)
        buttonE_4th.setOnClickListener {
            setupMediaPlayer(notesMap["E 4th"] ?: R.raw.e_4th)
            playNote()
            notesPlayed.add("E 4th")  // Record the note played
        }

        //4th string F
        val buttonF_4th: Button = findViewById(R.id.button_f_4th)
        buttonF_4th.setOnClickListener {
            setupMediaPlayer(notesMap["F 4th"] ?: R.raw.f_4th)
            playNote()
            notesPlayed.add("F 4th")  // Record the note played
        }

        //4th string F sharp
        val buttonFSharp_4th: Button = findViewById(R.id.button_f_sharp_4th)
        buttonFSharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["F# 4th"] ?: R.raw.f_sharp_4th)
            playNote()
            notesPlayed.add("F# 4th")  // Record the note played
        }

        //4th string G
        val buttonG_4th: Button = findViewById(R.id.button_g_4th)
        buttonG_4th.setOnClickListener {
            setupMediaPlayer(notesMap["G 4th"] ?: R.raw.g_4th)
            playNote()
            notesPlayed.add("G 4th")  // Record the note played
        }

        //4th string G#
        val buttonGSharp_4th: Button = findViewById(R.id.button_g_sharp_4th)
        buttonGSharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["G# 4th"] ?: R.raw.g_sharp_4th)
            playNote()
            notesPlayed.add("G# 4th")  // Record the note played
        }

        //4th string A
        val buttonA_4th: Button = findViewById(R.id.button_a_4th)
        buttonA_4th.setOnClickListener {
            setupMediaPlayer(notesMap["A 4th"] ?: R.raw.a_4th)
            playNote()
            notesPlayed.add("A 4th")  // Record the note played
        }

        //4th string A#
        val buttonASharp_4th: Button = findViewById(R.id.button_a_sharp_4th)
        buttonASharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["A# 4th"] ?: R.raw.a_sharp_4th)
            playNote()
            notesPlayed.add("A# 4th")  // Record the note played
        }

        //4th string B
        val buttonB_4th: Button = findViewById(R.id.button_b_4th)
        buttonB_4th.setOnClickListener {
            setupMediaPlayer(notesMap["B 4th"] ?: R.raw.b_4th)
            playNote()
            notesPlayed.add("B 4th")  // Record the note played
        }

        //4th string C
        val buttonC_4th: Button = findViewById(R.id.button_c_4th)
        buttonC_4th.setOnClickListener {
            setupMediaPlayer(notesMap["C 4th"] ?: R.raw.c_4th)
            playNote()
            notesPlayed.add("C 4th")  // Record the note played
        }

        //4th string C#
        val buttonCSharp_4th: Button = findViewById(R.id.button_c_sharp_4th)
        buttonCSharp_4th.setOnClickListener {
            setupMediaPlayer(notesMap["C# 4th"] ?: R.raw.c_sharp_4th)
            playNote()
            notesPlayed.add("C# 4th")  // Record the note played
        }

        //4th string C#
        val buttonD_4th: Button = findViewById(R.id.button_d_4th)
        buttonD_4th.setOnClickListener {
            setupMediaPlayer(notesMap["D 4th"] ?: R.raw.d_4th)
            playNote()
            notesPlayed.add("C# 4th")  // Record the note played
        }

        //3rd string G open
        val buttonGOpen_3rd: Button = findViewById(R.id.button_g_3rd_open)
        buttonGOpen_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["G 3rd Open"] ?: R.raw.g_3rd_open)
            playNote()
            notesPlayed.add("G 3rd Open")  // Record the note played
        }

        //3rd string G#
        val buttonGSharp_3rd: Button = findViewById(R.id.button_g_sharp_3rd)
        buttonGSharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["G# 3rd"] ?: R.raw.g_sharp_3rd)
            playNote()
            notesPlayed.add("G# 4th")  // Record the note played
        }

        //3rd string A
        val buttonA_3rd: Button = findViewById(R.id.button_a_3rd)
        buttonA_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["A 3rd"] ?: R.raw.a_3rd)
            playNote()
            notesPlayed.add("A 3rd")  // Record the note played
        }

        //3rd string A#
        val buttonASharp_3rd: Button = findViewById(R.id.button_a_sharp_3rd)
        buttonASharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["A# 3rd"] ?: R.raw.a_sharp_3rd)
            playNote()
            notesPlayed.add("A# 3rd")  // Record the note played
        }

        //3rd string B
        val buttonB_3rd: Button = findViewById(R.id.button_b_3rd)
        buttonB_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["B 3rd"] ?: R.raw.b_3rd)
            playNote()
            notesPlayed.add("B 3rd")  // Record the note played
        }

        //3rd string C
        val buttonC_3rd: Button = findViewById(R.id.button_c_3rd)
        buttonC_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["C 3rd"] ?: R.raw.c_3rd)
            playNote()
            notesPlayed.add("C 3rd")  // Record the note played
        }

        //3rd string C#
        val buttonCSharp_3rd: Button = findViewById(R.id.button_c_sharp_3rd)
        buttonCSharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["C# 3rd"] ?: R.raw.c_sharp_3rd)
            playNote()
            notesPlayed.add("C# 3rd")  // Record the note played
        }

        //3rd string D
        val buttonD_3rd: Button = findViewById(R.id.button_d_3rd)
        buttonD_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["D 3rd"] ?: R.raw.d_3rd)
            playNote()
            notesPlayed.add("D 3rd")  // Record the note played
        }

        //3rd string D#
        val buttonDSharp_3rd: Button = findViewById(R.id.button_d_sharp_3rd)
        buttonDSharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["D# 3rd"] ?: R.raw.d_sharp_3rd)
            playNote()
            notesPlayed.add("D# 3rd")  // Record the note played
        }

        //3rd string E
        val buttonE_3rd: Button = findViewById(R.id.button_e_3rd)
        buttonE_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["E 3rd"] ?: R.raw.e_3rd)
            playNote()
            notesPlayed.add("E 3rd")  // Record the note played
        }

        //3rd string F
        val buttonF_3rd: Button = findViewById(R.id.button_f_3rd)
        buttonF_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["F 3rd"] ?: R.raw.f_3rd)
            playNote()
            notesPlayed.add("F 3rd")  // Record the note played
        }

        //3rd string F#
        val buttonFSharp_3rd: Button = findViewById(R.id.button_f_sharp_3rd)
        buttonFSharp_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["F# 3rd"] ?: R.raw.f_sharp_3rd)
            playNote()
            notesPlayed.add("F# 3rd")  // Record the note played
        }

        //3rd string G
        val buttonG_3rd: Button = findViewById(R.id.button_g_3rd)
        buttonG_3rd.setOnClickListener {
            setupMediaPlayer(notesMap["F# 3rd"] ?: R.raw.g_3rd)
            playNote()
            notesPlayed.add("G 3rd")  // Record the note played
        }

        //2nd string B Open String
        val buttonBOpen_2nd: Button = findViewById(R.id.button_b_2nd_open)
        buttonBOpen_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["B 2nd Open"] ?: R.raw.b_2nd_open)
            playNote()
            notesPlayed.add("B 2nd Open")  // Record the note played
        }

        //2nd string C
        val buttonC_2nd: Button = findViewById(R.id.button_c_2nd)
        buttonC_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["C 2nd"] ?: R.raw.c_2nd)
            playNote()
            notesPlayed.add("C 2nd")  // Record the note played
        }

        //2nd string C#
        val buttonCSharp_2nd: Button = findViewById(R.id.button_c_sharp_2nd)
        buttonCSharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["C# 2nd"] ?: R.raw.c_sharp_2nd)
            playNote()
            notesPlayed.add("C# 2nd")  // Record the note played
        }

        //2nd string D
        val buttonD_2nd: Button = findViewById(R.id.button_d_2nd)
        buttonD_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["D 2nd"] ?: R.raw.d_2nd)
            playNote()
            notesPlayed.add("D 2nd")  // Record the note played
        }

        //2nd string D#
        val buttonDSharp_2nd: Button = findViewById(R.id.button_d_sharp_2nd)
        buttonDSharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["D# 2nd"] ?: R.raw.d_sharp_2nd)
            playNote()
            notesPlayed.add("D# 2nd")  // Record the note played
        }

        //2nd string E
        val buttonE_2nd: Button = findViewById(R.id.button_e_2nd)
        buttonE_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["E 2nd"] ?: R.raw.e_2nd)
            playNote()
            notesPlayed.add("E 2nd")  // Record the note played
        }

        //2nd string F
        val buttonF_2nd: Button = findViewById(R.id.button_f_2nd)
        buttonF_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["F 2nd"] ?: R.raw.f_2nd)
            playNote()
            notesPlayed.add("F 2nd")  // Record the note played
        }

        //2nd string F#
        val buttonFSharp_2nd: Button = findViewById(R.id.button_f_sharp_2nd)
        buttonFSharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["F# 2nd"] ?: R.raw.f_sharp_2nd)
            playNote()
            notesPlayed.add("F# 2nd")  // Record the note played
        }

        //2nd string G
        val buttonG_2nd: Button = findViewById(R.id.button_g_2nd)
        buttonG_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["G 2nd"] ?: R.raw.g_2nd)
            playNote()
            notesPlayed.add("G 2nd")  // Record the note played
        }

        //2nd string G#
        val buttonGSharp_2nd: Button = findViewById(R.id.button_g_sharp_2nd)
        buttonGSharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["G# 2nd"] ?: R.raw.g_sharp_2nd)
            playNote()
            notesPlayed.add("G# 2nd")  // Record the note played
        }

        //2nd string A
        val buttonA_2nd: Button = findViewById(R.id.button_a_2nd)
        buttonA_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["A 2nd"] ?: R.raw.a_2nd)
            playNote()
            notesPlayed.add("A 2nd")  // Record the note played
        }

        //2nd string A#
        val buttonASharp_2nd: Button = findViewById(R.id.button_a_sharp_2nd)
        buttonASharp_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["A# 2nd"] ?: R.raw.a_sharp_2nd)
            playNote()
            notesPlayed.add("A# 2nd")  // Record the note played
        }

        //2nd string B
        val buttonB_2nd: Button = findViewById(R.id.button_b_2nd)
        buttonB_2nd.setOnClickListener {
            setupMediaPlayer(notesMap["B 2nd"] ?: R.raw.b_2nd)
            playNote()
            notesPlayed.add("B 2nd")  // Record the note played
        }

        //1st string E Open
        val buttonEOpen_1st: Button = findViewById(R.id.button_e_1st_open)
        buttonEOpen_1st.setOnClickListener {
            setupMediaPlayer(notesMap["E 1st Open"] ?: R.raw.e_1st_open)
            playNote()
            notesPlayed.add("E 1st Open")  // Record the note played
        }

        //1st string F
        val buttonF_1st: Button = findViewById(R.id.button_f_1st)
        buttonF_1st.setOnClickListener {
            setupMediaPlayer(notesMap["F 1st"] ?: R.raw.f_1st)
            playNote()
            notesPlayed.add("F 1st")  // Record the note played
        }

        //1st string F#
        val buttonFSharp_1st: Button = findViewById(R.id.button_f_sharp_1st)
        buttonFSharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["F# 1st"] ?: R.raw.f_sharp_1st)
            playNote()
            notesPlayed.add("F# 1st")  // Record the note played
        }

        //1st string G
        val buttonG_1st: Button = findViewById(R.id.button_g_1st)
        buttonG_1st.setOnClickListener {
            setupMediaPlayer(notesMap["G 1st"] ?: R.raw.g_1st)
            playNote()
            notesPlayed.add("G 1st")  // Record the note played
        }

        //1st string G#
        val buttonGSharp_1st: Button = findViewById(R.id.button_g_sharp_1st)
        buttonGSharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["G# 1st"] ?: R.raw.g_sharp_1st)
            playNote()
            notesPlayed.add("G# 1st")  // Record the note played
        }

        //1st string A
        val buttonA_1st: Button = findViewById(R.id.button_a_1st)
        buttonA_1st.setOnClickListener {
            setupMediaPlayer(notesMap["A 1st"] ?: R.raw.a_1st)
            playNote()
            notesPlayed.add("A 1st")  // Record the note played
        }

        //1st string A#
        val buttonASharp_1st: Button = findViewById(R.id.button_a_sharp_1st)
        buttonASharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["A# 1st"] ?: R.raw.a_sharp_1st)
            playNote()
            notesPlayed.add("A# 1st")  // Record the note played
        }

        //1st string B
        val buttonB_1st: Button = findViewById(R.id.button_b_1st)
        buttonB_1st.setOnClickListener {
            setupMediaPlayer(notesMap["B 1st"] ?: R.raw.b_1st)
            playNote()
            notesPlayed.add("B 1st")  // Record the note played
        }

        //1st string C
        val buttonC_1st: Button = findViewById(R.id.button_c_1st)
        buttonC_1st.setOnClickListener {
            setupMediaPlayer(notesMap["C 1st"] ?: R.raw.c_1st)
            playNote()
            notesPlayed.add("C 1st")  // Record the note played
        }

        //1st string C#
        val buttonCSharp_1st: Button = findViewById(R.id.button_c_sharp_1st)
        buttonCSharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["C# 1st"] ?: R.raw.c_sharp_1st)
            playNote()
            notesPlayed.add("C# 1st")  // Record the note played
        }

        //1st string D
        val buttonD_1st: Button = findViewById(R.id.button_d_1st)
        buttonD_1st.setOnClickListener {
            setupMediaPlayer(notesMap["D 1st"] ?: R.raw.d_1st)
            playNote()
            notesPlayed.add("D 1st")  // Record the note played
        }

        //1st string D#
        val buttonDSharp_1st: Button = findViewById(R.id.button_d_sharp_1st)
        buttonDSharp_1st.setOnClickListener {
            setupMediaPlayer(notesMap["D# 1st"] ?: R.raw.d_sharp_1st)
            playNote()
            notesPlayed.add("D# 1st")  // Record the note played
        }

        //1st string E
        val buttonE_1st: Button = findViewById(R.id.button_e_1st)
        buttonE_1st.setOnClickListener {
            setupMediaPlayer(notesMap["E 1st"] ?: R.raw.e_1st)
            playNote()
            notesPlayed.add("E 1st")  // Record the note played
        }

    }

    //function to validate note sequence of each scale
    private fun validateNotesAndShowPopup() {
        val isCorrect = checkIfScalePlayedCorrectly()
        if (isCorrect) {
            showPopup("Correct", "You played the scale correctly!")
        } else {
            showPopup("Incorrect", "Try again.")
        }
        notesPlayed.clear()
    }

    private fun checkIfScalePlayedCorrectly(): Boolean {
        // logic to check the notes
        return notesPlayed == correctSequences[currentScale]
    }

    private fun showPopup(title: String, message: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("OK") { dialog, which -> dialog.dismiss() }
            .show()
    }

    //mapping to audio file
    private fun getNotesForScale(scale: String): Map<String, Int> {
        return when (scale) {
            "C Major Scale" -> mapOf(
                "E 6th Open" to R.raw.e_6th_open,
                "F 6th" to R.raw.f_6th,
                "G 6th" to R.raw.g_6th,
                "C 5th" to R.raw.c_5th,
                "D 4th" to R.raw.d_4th,
                "E 4th" to R.raw.e_4th,
                "F 4th" to R.raw.f_4th,
                "G 3rd Open" to R.raw.g_3rd_open,
                "A 4th" to R.raw.a_4th,
                "B 2nd Open" to R.raw.b_2nd_open,
                "C 2nd" to R.raw.c_2nd,
                "D 2nd" to R.raw.d_2nd,
                "E 2nd" to R.raw.e_6th_open,
                "F 1st Open" to R.raw.f_6th,
                "G 1st" to R.raw.g_1st

            )
            "A Minor Pentatonic" -> mapOf(
                "E 6th Open" to R.raw.e_6th_open,
                "G 6th" to R.raw.g_6th,
                "A 5th" to R.raw.a_5th_open,
                "C 5th" to R.raw.c_5th,
                "D 5th" to R.raw.d_5th,
                "E 4th" to R.raw.e_4th,
                "G 3rd Open" to R.raw.g_3rd_open,
                "A 3rd" to R.raw.a_3rd,
                "C 2nd" to R.raw.c_2nd,
                "D 2nd" to R.raw.d_2nd,
                "E 1st Open" to R.raw.e_6th_open,
                "G 1st" to R.raw.g_1st
            )
            "G Major Scale" -> mapOf(
                "G 6th" to R.raw.g_6th,
                "A 5th" to R.raw.a_5th_open,
                "B 5th" to R.raw.b_5th,
                "C 5th" to R.raw.c_5th,
                "D 4th" to R.raw.d_4th,
                "E 4th" to R.raw.e_4th,
                "F# 4th" to R.raw.f_sharp_4th,
                "G 3rd Open" to R.raw.g_3rd_open,
                "A 3rd" to R.raw.a_3rd,
                "B 2nd Open" to R.raw.b_2nd_open,
                "C 2nd" to R.raw.c_2nd,
                "D 2nd" to R.raw.d_2nd,
                "E 1st Open" to R.raw.e_1st_open,
                "F# 1st" to R.raw.f_sharp_1st
            )
            "E Minor Pentatonic" -> mapOf(
                "E 6th Open" to R.raw.e_6th_open,
                "G 6th" to R.raw.g_6th,
                "A 5th Open" to R.raw.a_5th_open,
                "B 5th" to R.raw.b_5th,
                "D 4th Open" to R.raw.d_4th_open,
                "E 4th" to R.raw.e_4th,
                "G 3rd Open" to R.raw.g_3rd_open,
                "A 3rd" to R.raw.a_3rd,
                "B 2nd Open" to R.raw.b_2nd_open,
                "D 2nd" to R.raw.d_2nd,
                "E 1st Open" to R.raw.e_1st_open,
                "G 1st" to R.raw.g_1st
            )
            "E Harmonic Minor" -> mapOf(
                "E 6th Open" to R.raw.e_6th_open,
                "F# 6th" to R.raw.f_sharp_6th,
                "G 6th" to R.raw.g_6th,
                "A 5th Open" to R.raw.a_5th_open,
                "B 5th" to R.raw.b_5th,
                "C 5th" to R.raw.c_5th,
                "D 4th Open" to R.raw.d_4th_open,
                "E 4th" to R.raw.e_4th,
                "F# 4th" to R.raw.f_sharp_4th,
                "G 3rd Open" to R.raw.g_3rd_open,
                "A 3rd" to R.raw.a_3rd,
                "B 2nd Open" to R.raw.b_2nd_open,
                "C 2nd" to R.raw.c_2nd,
                "D 2nd" to R.raw.d_2nd,
                "E 1st Open" to R.raw.e_1st_open,
                "F# 1st" to R.raw.f_sharp_1st,
                "G 1st" to R.raw.g_1st
            )
            else -> emptyMap()
        }
    }

    //program start here
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        //this is used for floating button to check whether users have played correct or not
        val finishButton: FloatingActionButton = findViewById(R.id.finishButton)
        finishButton.setOnClickListener {
            // Call a method that checks if the user played the correct scale
            validateNotesAndShowPopup()
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

    //this function is used to update scale that users have chosen
    private fun updateScale(scale: String) {
        // This could involve updating the visible notes, changing button labels, etc.
        currentScale = scale  // Update the current scale
        setupButtonNotes(scale)
    }

    //this function is used to destroy mp3 that is playing
    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}