package me.darthwithap.android.fabricatoraccount.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import me.darthwithap.android.fabricatoraccount.domain.usecases.dashboard.DashboardUseCases
import me.darthwithap.android.fabricatoraccount.domain.usecases.dashboard.GetWeekDates

@Module
@InstallIn(ViewModelComponent::class)
object DashboardModule {
  @Provides
  @ViewModelScoped
  fun provideGetWeekDatesUseCase(): GetWeekDates {
    return GetWeekDates()
  }

  @Provides
  @ViewModelScoped
  fun provideDashboardUseCases(
    // TODO: add all useCases that the dashboard screen will require here
    getWeekDates: GetWeekDates
  ): DashboardUseCases {
    return DashboardUseCases(
      getWeekDates
    )
  }
}