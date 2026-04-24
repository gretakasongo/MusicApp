package com.example.musicapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Adding variable for song
        var songName = findViewById<TextView>(R.id.songName)
        var songdisplay = ""

        // Adding songs to the list
        var song1 = song("beauty and the beat","Justin Bieber",2022,"3:23")
        var song2 = song("risk it all","Bruno Mars",2026,"3:50")
        var song3 = song("baby","Justin Bieber",2010,"3:23")
        var song4 = song("bad guy","unknown artist",0,"3:23")
        var song5 = song("The fate of ophelia","Unknown Artist",0,"3:23")

        // creating array to store songs
        var songs = arrayOf<song>(song1,song2,song3,song4,song5)

        // for loop to loop through and display items in song array
        for (song in songs){
            songdisplay += "${song.DisplaySongs()}\n\n"
        }
        songName.text = songdisplay

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}