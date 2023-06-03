package me.darthwithap.android.fabricatoraccount.data.repository

import kotlinx.coroutines.flow.Flow
import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.mapper.toDomainModel
import me.darthwithap.android.fabricatoraccount.data.mapper.toEntity
import me.darthwithap.android.fabricatoraccount.domain.models.Fabricator
import me.darthwithap.android.fabricatoraccount.domain.repository.FabricatorRepository
import javax.inject.Inject

class FabricatorRepositoryImpl @Inject constructor(
  db: AppDatabase
) : FabricatorRepository {
  private val dao = db.fabricatorDao
  override suspend fun upsertFabricator(fabricator: Fabricator) {
    dao.upsertFabricator(fabricator.toEntity())
  }

  override suspend fun deleteFabricator(fabricator: Fabricator) {
    TODO("Not yet implemented")
  }

  override suspend fun deleteAllFabricators() {
    TODO("Not yet implemented")
  }

  //TOdo: Add Flow implementation of retrieving fabricator if needed
  override fun getFabricatorById(id: String): Fabricator {
    return dao.getFabricatorById(id)?.toDomainModel()
      ?: throw IllegalArgumentException("Fabricator with id: $id not found")
  }

  override suspend fun getAllFabricators(): Flow<List<Fabricator>?> {
    TODO("Not yet implemented")
  }

}