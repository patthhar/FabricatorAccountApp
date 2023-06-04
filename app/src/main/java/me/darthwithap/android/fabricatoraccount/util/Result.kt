package me.darthwithap.android.fabricatoraccount.util

sealed class Result<T>(val data: T? = null, val msg: String? = null) {
  class Success<T>(data: T?, msg: String? = null) : Result<T>(data, msg)
  class Error<T>(msg: String, data: T? = null) : Result<T>(data, msg)
  class Loading<T>(val isLoading: Boolean = false) : Result<T>()
}