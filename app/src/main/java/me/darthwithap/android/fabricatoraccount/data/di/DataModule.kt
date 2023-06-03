package me.darthwithap.android.fabricatoraccount.data.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.repository.FabricatorRepositoryImpl
import me.darthwithap.android.fabricatoraccount.domain.repository.FabricatorRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
  @Provides
  @Singleton
  fun provideFabricatorRepository(
    db: AppDatabase
  ): FabricatorRepository {
    return FabricatorRepositoryImpl(db)
  }
}