package com.example.musicapp

import android.util.Log

class song {

    // Adding variable for song
    var name : String = ""
    var artist: String = ""
    var year : Int = 0
    var duration : String = ""
    var path : String = ""

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