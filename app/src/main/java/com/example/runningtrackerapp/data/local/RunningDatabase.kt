package com.example.runningtrackerapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.runningtrackerapp.data.dao.RunDAO
import com.example.runningtrackerapp.data.entities.Run
import com.example.runningtrackerapp.utils.Converters

@Database(entities = [Run::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {
    abstract fun getRunDAO(): RunDAO
}