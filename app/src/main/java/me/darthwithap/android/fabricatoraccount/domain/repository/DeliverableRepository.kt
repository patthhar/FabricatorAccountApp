package me.darthwithap.android.fabricatoraccount.domain.repository

import me.darthwithap.android.fabricatoraccount.domain.models.FabricatorDeliverable

interface DeliverableRepository {
  suspend fun upsertDeliverable(deliverable: FabricatorDeliverable)
  suspend fun deleteDeliverable(deliverable: FabricatorDeliverable)
  suspend fun deleteDeliverableForFabricator(fabricatorId: String)

  fun getDeliverableById(deliverableId: String): FabricatorDeliverable
}