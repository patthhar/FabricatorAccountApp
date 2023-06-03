package me.darthwithap.android.fabricatoraccount.data.repository

import kotlinx.coroutines.flow.Flow
import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.domain.models.Fabricator
import me.darthwithap.android.fabricatoraccount.domain.repository.FabricatorRepository
import javax.inject.Inject

class FabricatorRepositoryImpl @Inject constructor(
  private val db: AppDatabase
) : FabricatorRepository {
  override suspend fun upsertFabricator(fabricator: Fabricator) {
    TODO("Not yet implemented")
  }

  override suspend fun deleteFabricator(fabricator: Fabricator) {
    TODO("Not yet implemented")
  }

  override suspend fun deleteAllFabricators() {
    TODO("Not yet implemented")
  }

  override fun getFabricatorById(id: String): Flow<Fabricator> {
    TODO("Not yet implemented")
  }

  override suspend fun getAllFabricators(): Flow<List<Fabricator>?> {
    TODO("Not yet implemented")
  }

}