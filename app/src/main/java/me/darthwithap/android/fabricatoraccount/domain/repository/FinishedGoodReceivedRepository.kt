package me.darthwithap.android.fabricatoraccount.domain.repository

import me.darthwithap.android.fabricatoraccount.domain.models.FinishedGoodReceived

interface FinishedGoodReceivedRepository {
  suspend fun upsertFinishedGoodReceived(finishedGoodReceived: FinishedGoodReceived)
  suspend fun deleteFinishedGoodReceived(finishedGoodReceived: FinishedGoodReceived)
}