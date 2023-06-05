package me.darthwithap.android.fabricatoraccount.presentation.dashboard

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import me.darthwithap.android.fabricatoraccount.domain.usecases.dashboard.DashboardUseCases
import javax.inject.Inject

@RequiresApi(Build.VERSION_CODES.O)
@HiltViewModel
class DashboardViewModel @Inject constructor(
  // add useCases required by the viewModel for the business logic here
  private val dashboardUseCases: DashboardUseCases
) : ViewModel() {
  var state by mutableStateOf(DashboardState())
    private set

  private val _uiEvent = Channel<DashboardEvent>()
  val uiEvent = _uiEvent.receiveAsFlow()

  private val getFromFabricatorSlips: Job? = null

  init {
    // TODO: fetch active slips and today's slips and
    //  maybe even fabricator's balances
    refreshWeekDates()
  }

  fun onEvent(event: DashboardEvent) {
    when (event) {
      is DashboardEvent.OnActiveSlipClick -> {
        // TODO: navigate to slipDetails Screen
      }

      DashboardEvent.OnAddFabricatorSlipClick -> {
        // TODO: show a fab that has two options. Or just show a bottom dialog
      }

      is DashboardEvent.OnDateChange -> {
        state = state.copy(
          selectedDate = event.date
        )
        refreshFromFabricatorSlips()
      }

      DashboardEvent.OnNextWeekClick -> {
        state = state.copy(selectedDate = state.selectedDate.plusWeeks(1))
        refreshWeekDates()
      }

      DashboardEvent.OnPreviousWeekClick -> {
        state = state.copy(selectedDate = state.selectedDate.minusWeeks(1))
        refreshWeekDates()
      }

      is DashboardEvent.OnSlipClick -> {
        // TODO: navigate to the FromFabricatorSlip screen
      }
    }
  }

  /*fun getFromFabricatorSlipsForDate(date: LocalDate): List<FromFabricatorSlip> {

  }*/

  private fun refreshFromFabricatorSlips() {
    getFromFabricatorSlips?.cancel()

  }

  private fun refreshWeekDates() {
    state = state.copy(
      weekDates = dashboardUseCases.getWeekDates(state.selectedDate)
    )
  }
}