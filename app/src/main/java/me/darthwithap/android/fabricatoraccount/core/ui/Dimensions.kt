package me.darthwithap.android.fabricatoraccount.core.ui

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Dimensions(
  val none: Dp = 0.dp,
  val xs: Dp = 2.dp,
  val small: Dp = 4.dp,
  val regular: Dp = 6.dp,
  val base: Dp = 8.dp,
  val medium: Dp = 12.dp,
  val big: Dp = 16.dp,
  val large: Dp = 24.dp,
  val xl: Dp = 32.dp,
  val xxl: Dp = 48.dp,
  val enormous: Dp = 64.dp,
)

data class TextDimensions(
  val xs: TextUnit = 11.sp,
  val small: TextUnit = 12.sp,
  val base: TextUnit = 14.sp,
  val medium: TextUnit = 16.sp,
  val big: TextUnit = 20.sp,
  val large: TextUnit = 124.sp,
  val xl: TextUnit = 26.sp,
  val xxl: TextUnit = 34.sp,
  val enormous: TextUnit = 43.sp,
)

val TextSizes = compositionLocalOf {
  TextDimensions()
}

val LocalDimensions = compositionLocalOf {
  Dimensions()
}
