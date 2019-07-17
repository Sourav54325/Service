package com.errorfoundtechnologies.service

import android.content.Intent
import android.os.IBinder
import android.R.raw
import android.app.Service
import android.media.MediaPlayer


class ItsService : Service() {
    var player: MediaPlayer? = null

    override fun onBind(arg0: Intent): IBinder? {

        return null
    }

    override fun onCreate() {
        super.onCreate()
        player = MediaPlayer.create(this,R.raw.abx)
        player?.isLooping = true // Set looping
        //player?.setVolume(100f, 100f)

    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {

        player = MediaPlayer.create(this,R.raw.abx)
        player?.isLooping = true // Set looping
        player?.start()
        return Service.START_STICKY
    }

    override fun onStart(intent: Intent, startId: Int) {
        // TO DO
    }





    override fun onDestroy() {
        player?.stop()
        player?.release()
    }
}