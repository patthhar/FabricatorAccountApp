package me.darthwithap.android.fabricatoraccount

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import me.darthwithap.android.fabricatoraccount.core.ui.theme.FabricatorAccountTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      FabricatorAccountTheme {
      }
    }
  }
}
