package me.darthwithap.android.fabricatoraccount.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.mapper.toEntity
import me.darthwithap.android.fabricatoraccount.domain.models.ToFabricatorSlip
import me.darthwithap.android.fabricatoraccount.domain.repository.ToFabricatorSlipRepository
import javax.inject.Inject

@RequiresApi(Build.VERSION_CODES.O)
class ToFabricatorSlipRepositoryImpl @Inject constructor(
  db: AppDatabase
) : ToFabricatorSlipRepository {
  private val dao = db.toFabricatorSlipDao

  override suspend fun upsertToFabricatorSlip(toFabricatorSlip: ToFabricatorSlip) {
    dao.upsertToFabricatorSlipDao(toFabricatorSlip.toEntity())
  }

  override suspend fun deleteToFabricatorSlip(toFabricatorSlip: ToFabricatorSlip) {
    dao.deleteToFabricatorSlipDao(toFabricatorSlip.toEntity())
  }

  override suspend fun deleteOldToFabricatorSlips(fabricatorId: String) {
    dao.deleteOldToFabricatorSlips()
  }
}