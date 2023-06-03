package me.darthwithap.android.fabricatoraccount.domain.repository

import me.darthwithap.android.fabricatoraccount.domain.models.FinishedGood

interface FinishedGoodRepository {
  suspend fun upsertFinishedGood(finishedGood: FinishedGood)
  suspend fun deleteUpsertFinishedGood(finishedGood: FinishedGood)
  fun getFinishedGoodById(id: String): FinishedGood
}