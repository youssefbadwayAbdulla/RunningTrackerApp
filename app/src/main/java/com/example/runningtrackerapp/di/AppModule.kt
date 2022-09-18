package com.example.runningtrackerapp.di

import android.content.Context
import androidx.room.Room
import com.example.runningtrackerapp.data.local.RunningDatabase
import com.example.runningtrackerapp.utils.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideRunningDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, RunningDatabase::class.java, RUNNING_DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRunningDAO(db: RunningDatabase) = db.getRunDAO()

}