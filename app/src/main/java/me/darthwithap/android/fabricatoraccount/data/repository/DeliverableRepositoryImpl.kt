package me.darthwithap.android.fabricatoraccount.data.repository

import me.darthwithap.android.fabricatoraccount.data.local.AppDatabase
import me.darthwithap.android.fabricatoraccount.data.mapper.toEntity
import me.darthwithap.android.fabricatoraccount.domain.models.FabricatorDeliverable
import me.darthwithap.android.fabricatoraccount.domain.repository.DeliverableRepository
import javax.inject.Inject

class DeliverableRepositoryImpl @Inject constructor(
  db: AppDatabase
) : DeliverableRepository {
  private val dao = db.deliverableDao
  override suspend fun upsertDeliverable(deliverable: FabricatorDeliverable) {
    dao.upsertDeliverable(deliverable.toEntity())
  }

  override suspend fun deleteDeliverable(deliverable: FabricatorDeliverable) {
    TODO("Not yet implemented")
  }

  override suspend fun deleteDeliverableForFabricator(fabricatorId: String) {
    TODO("Not yet implemented")
  }

  override fun getDeliverableById(deliverableId: String): FabricatorDeliverable {
    TODO("Not yet implemented")
  }

}