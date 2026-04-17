package com.example.musicapp

import android.util.Log

class song(
    songName: String,
    songArtist: String,
    songYear: Int,
    songDuration: String,) {

    // Adding variable for song
    var name : String = ""
    var artist: String = ""
    var year : Int = 0
    var duration : String = ""

    // Adding constructor for song
    constructor(songName: String,songArtist: String)
            : this(songName,songArtist,0,""){}

    // Adding constructor for song
    init{
        name = songName
        artist = songArtist
        year = songYear
        duration = songDuration
    }

    // function to play the song
    fun Play(){
        Log.v("Song","$name is playing")
    }

    // function to pause the song
    fun Pause(){
        Log.v("Song","$name  paused now")
    }

    // function to stop the song
    fun Stop(){
        Log.v("Song","$name stopped now")
    }
    // function to favourite the song
    fun Favourite(): Boolean{
        Log.v("Song","$name is favourited now")
        return true
    }
}