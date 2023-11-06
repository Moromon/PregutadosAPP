package com.example.apptrivial.components

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.interaction.PressInteraction
import com.example.apptrivial.R


class CustomMediaPlayer(var context: Context){
    val songList = listOf(R.raw.background,R.raw.background2)
    var mediaPlayer: MediaPlayer? = null
    private var currentSongIndex: Int = 0

    fun CreateStart() {
        mediaPlayer = MediaPlayer.create(context, songList[currentSongIndex])
        mediaPlayer?.start()

        mediaPlayer?.setOnCompletionListener { PlayNextSong() }

    }

    private fun PlayNextSong() {
        if (currentSongIndex < songList.size - 1) currentSongIndex++
        else    currentSongIndex = 0
            loadSong(currentSongIndex)
            mediaPlayer?.start()

    }
    private fun loadSong(index: Int) {
        mediaPlayer?.reset()
        mediaPlayer = MediaPlayer.create(context, songList[currentSongIndex])
    }
    fun Release(){
        mediaPlayer?.release()
    }

    fun Pause() {
        mediaPlayer?.pause()
    }

    fun Start() {
        mediaPlayer?.start()
    }


}