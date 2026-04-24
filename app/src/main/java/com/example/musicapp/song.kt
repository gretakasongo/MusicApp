package com.example.musicapp

import android.util.Log

class song(
    var name: String,
    var artist: String = "Unknown Artist",
    var year: Int = 0,
    var duration: String = ""
) {
    // Primary  constructor for name and artist
    constructor(songName: String, songArtist: String)
            : this(songName, songArtist, 0, "") {
    }
    // secondary constructor for only name and duration
    constructor(songName: String, songDuration: String, isDuration: Boolean)
            : this(songName, "Unknown Artist", 0, songDuration) {
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
    // function to display the song
    fun DisplaySongs() : String{
        return "$name - $artist - $year - $duration"
    }
}
