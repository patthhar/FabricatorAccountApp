package me.darthwithap.android.fabricatoraccount.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
  @Provides
  @Singleton
  fun provideAppDatabase(app: Application): AppDatabase {
    return Room.databaseBuilder(
      app,
      AppDatabase::class.java,
      "app.db"
    )
      .fallbackToDestructiveMigration()
      .build()
  }

}