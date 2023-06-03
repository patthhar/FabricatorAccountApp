package me.darthwithap.android.fabricatoraccount.data.repository

import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.mapper.toEntity
import me.darthwithap.android.fabricatoraccount.domain.models.FromFabricatorSlip
import me.darthwithap.android.fabricatoraccount.domain.repository.FromFabricatorSlipRepository
import javax.inject.Inject

class FromFabricatorSlipRepositoryImpl @Inject constructor(
  db: AppDatabase
) : FromFabricatorSlipRepository{
  private val dao = db.fromFabricatorSlipDao
  override suspend fun upsertFromFabricatorSlip(fromFabricatorSlip: FromFabricatorSlip) {
    dao.upsertFromFabricatorSlip(fromFabricatorSlip.toEntity())
  }

  override suspend fun deleteFromFabricatorSlip(fromFabricatorSlip: FromFabricatorSlip) {
    dao.deleteFromFabricatorSlip(fromFabricatorSlip.toEntity())
  }
}