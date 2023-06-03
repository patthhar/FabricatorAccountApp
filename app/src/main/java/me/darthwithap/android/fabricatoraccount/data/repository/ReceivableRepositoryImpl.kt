package me.darthwithap.android.fabricatoraccount.data.repository

import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.mapper.toEntity
import me.darthwithap.android.fabricatoraccount.domain.models.FabricatorReceivable
import me.darthwithap.android.fabricatoraccount.domain.repository.ReceivableRepository
import javax.inject.Inject

class ReceivableRepositoryImpl @Inject constructor(
  db: AppDatabase
) :ReceivableRepository {
  private val dao = db.receivableDao
  override suspend fun upsertReceivable(receivable: FabricatorReceivable) {
    dao.upsertReceivable(receivable.toEntity())
  }

  override suspend fun deleteReceivable(receivable: FabricatorReceivable) {
    dao.deleteReceivable(receivable.toEntity())
  }

}