package me.darthwithap.android.fabricatoraccount.data.repository

import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.mapper.toEntity
import me.darthwithap.android.fabricatoraccount.domain.models.FinishedGoodReceived
import me.darthwithap.android.fabricatoraccount.domain.repository.FinishedGoodReceivedRepository
import javax.inject.Inject

class FinishedGoodReceivedRepositoryImpl @Inject constructor(
  db: AppDatabase
) : FinishedGoodReceivedRepository {
  private val dao = db.finishedGoodReceivedDao
  override suspend fun upsertFinishedGoodReceived(finishedGoodReceived: FinishedGoodReceived) {
    dao.upsertFinishedGoodReceived(finishedGoodReceived.toEntity())
  }

  override suspend fun deleteFinishedGoodReceived(finishedGoodReceived: FinishedGoodReceived) {
    dao.deleteFinishedGoodReceived(finishedGoodReceived.toEntity())
  }
}