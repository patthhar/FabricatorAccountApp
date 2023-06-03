package me.darthwithap.android.fabricatoraccount.data.repository

import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.mapper.toDomainModel
import me.darthwithap.android.fabricatoraccount.data.mapper.toEntity
import me.darthwithap.android.fabricatoraccount.domain.models.RawMaterial
import me.darthwithap.android.fabricatoraccount.domain.repository.RawMaterialRepository
import javax.inject.Inject

class RawMaterialRepositoryImpl @Inject constructor(
  db: AppDatabase
) : RawMaterialRepository {
  private val dao = db.rawMaterialDao
  override suspend fun upsertRawMaterial(rawMaterial: RawMaterial) {
    dao.upsertRawMaterial(rawMaterial.toEntity())
  }

  override suspend fun deleteRawMaterial(rawMaterial: RawMaterial) {
    dao.deleteRawMaterial(rawMaterial.toEntity())
  }

  override fun getRawMaterialById(id: String): RawMaterial {
    return dao.getRawMaterialById(id).toDomainModel()
  }
}