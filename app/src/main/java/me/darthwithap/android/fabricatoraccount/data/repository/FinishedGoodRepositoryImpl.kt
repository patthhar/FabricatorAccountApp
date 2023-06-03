package me.darthwithap.android.fabricatoraccount.data.repository

import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.mapper.toDomainModel
import me.darthwithap.android.fabricatoraccount.domain.models.FinishedGood
import me.darthwithap.android.fabricatoraccount.domain.repository.FinishedGoodRepository
import me.darthwithap.android.fabricatoraccount.domain.repository.RawMaterialRepository
import javax.inject.Inject

class FinishedGoodRepositoryImpl @Inject constructor(
  val db: AppDatabase,
  private val rawMaterialRepository: RawMaterialRepository
) : FinishedGoodRepository {
  private val dao = db.finishedGoodDao
  override suspend fun upsertFinishedGood(finishedGood: FinishedGood) {
  }

  override suspend fun deleteUpsertFinishedGood(finishedGood: FinishedGood) {

  }

  override fun getFinishedGoodById(id: String): FinishedGood {
    return dao.getFinishedGoodById(id).toDomainModel(rawMaterialRepository)
  }
}