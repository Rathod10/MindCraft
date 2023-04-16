package com.example.myjournal

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Song2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song2)
        getSupportActionBar()?.hide()
                // create an instance of mediplayer for audio playback
                val mediaPlayer: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.afternoonmusic)

                // register all the buttons using their appropriate IDs
                val bPlay: ImageView = findViewById(R.id.playButton)
                val bPause: ImageView = findViewById(R.id.pauseButton)
                val bStop: ImageView = findViewById(R.id.stopButton)

                // handle the start button to
                // start the audio playback
                bPlay.setOnClickListener {
                    // start method is used to start
                    // playing the audio file
                    mediaPlayer.start()
                }

                // handle the pause button to put the
                // MediaPlayer instance at the Pause state
                bPause.setOnClickListener {
                    // pause() method can be used to
                    // pause the mediaplyer instance
                    mediaPlayer.pause()
                }

                // handle the stop button to stop playing
                // and prepare the mediaplayer instance
                // for the next instance of play
                bStop.setOnClickListener {
                    // stop() method is used to completely
                    // stop playing the mediaplayer instance
                    mediaPlayer.stop()

                    // after stopping the mediaplayer instance
                    // it is again need to be prepared
                    // for the next instance of playback
                    mediaPlayer.prepare()
                }
            }
        }


