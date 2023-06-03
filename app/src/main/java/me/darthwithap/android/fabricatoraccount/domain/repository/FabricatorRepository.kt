package me.darthwithap.android.fabricatoraccount.domain.repository

import kotlinx.coroutines.flow.Flow
import me.darthwithap.android.fabricatoraccount.domain.models.Fabricator

interface FabricatorRepository {
  suspend fun upsertFabricator(fabricator: Fabricator)
  suspend fun deleteFabricator(fabricator: Fabricator)
  suspend fun deleteAllFabricators()
  fun getFabricatorById(id: String): Fabricator
  suspend fun getAllFabricators(): Flow<List<Fabricator>?>
}