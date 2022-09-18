package com.example.runningtrackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.runningtrackerapp.data.dao.RunDAO
import dagger.hilt.android.AndroidEntryPoint


import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var runDAO: RunDAO
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("runDAO","RunningDAO..${runDAO.hashCode()}")
    }
}