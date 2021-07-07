package com.example.project1

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import java.util.*

object AlarmPlay {

    var mediaPlayer: MediaPlayer? = null
    var audioManager: AudioManager? = null

    fun startAlarm(context: Context){

        var sounds = intArrayOf(
            R.raw.alarm1,
            R.raw.alarm2,
            R.raw.alarm3,
            R.raw.alarm4
        )
        val random = Random()
        val num = random.nextInt(4)

        mediaPlayer = MediaPlayer.create(context, sounds[num])
        audioManager = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager!!.setStreamVolume(AudioManager.STREAM_MUSIC, 5, 0)
        mediaPlayer?.isLooping = true
        mediaPlayer?.start()
    }

    fun stopAudio(){
        mediaPlayer?.stop()
    }


}