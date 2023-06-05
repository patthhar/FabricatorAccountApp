package me.darthwithap.android.fabricatoraccount.presentation.dashboard

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import me.darthwithap.android.fabricatoraccount.core.ui.LocalDimensions
import me.darthwithap.android.fabricatoraccount.core.ui.TextSizes
import me.darthwithap.android.fabricatoraccount.presentation.dashboard.components.HorizontalDatePicker
import me.darthwithap.android.fabricatoraccount.presentation.dashboard.components.SlipItemsList

@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DashboardScreen(
  viewModel: DashboardViewModel = hiltViewModel()
) {
  val state = viewModel.state
  val textSizes = TextSizes.current
  val dimens = LocalDimensions.current

  Scaffold(
    topBar = {
      TopAppBar(title = { Text(text = "Dashboard") })
    }
  ) {
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(it)
    ) {
      HorizontalDatePicker(
        selectedDate = state.selectedDate,
        weekDates = state.weekDates,
        onPreviousWeekClick = { viewModel.onEvent(DashboardEvent.OnPreviousWeekClick) },
        onNextWeekClick = { viewModel.onEvent(DashboardEvent.OnNextWeekClick) },
        onDateSelected = { date ->
          viewModel.onEvent(DashboardEvent.OnDateChange(date))
        },
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = dimens.medium)
      )
      Spacer(modifier = Modifier.height(dimens.medium))
      SlipItemsList(
        date = state.selectedDate,
        slips = state.todaySlips
      ) { slip ->
        viewModel.onEvent(DashboardEvent.OnSlipClick(slip))
      }
    }
  }
}