package me.darthwithap.android.fabricatoraccount

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import dagger.hilt.android.AndroidEntryPoint
import me.darthwithap.android.fabricatoraccount.core.ui.theme.FabricatorAccountTheme
import me.darthwithap.android.fabricatoraccount.presentation.dashboard.DashboardScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  @RequiresApi(Build.VERSION_CODES.O)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      FabricatorAccountTheme {
        DashboardScreen()
      }
    }
  }
}
