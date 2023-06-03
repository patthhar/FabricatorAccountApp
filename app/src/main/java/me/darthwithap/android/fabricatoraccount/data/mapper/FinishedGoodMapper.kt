package me.darthwithap.android.fabricatoraccount.data.mapper

import me.darthwithap.android.fabricatoraccount.data.local.entity.FinishedGoodEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.FinishedGoodReceivedEntity
import me.darthwithap.android.fabricatoraccount.domain.models.FinishedGood
import me.darthwithap.android.fabricatoraccount.domain.models.FinishedGoodReceived
import me.darthwithap.android.fabricatoraccount.domain.repository.DeliverableRepository
import me.darthwithap.android.fabricatoraccount.domain.repository.RawMaterialRepository

fun FinishedGoodEntity.toDomainModel(rawMaterialRepository: RawMaterialRepository):
    FinishedGood {
  return FinishedGood(
    id = id,
    name = name,
    rawMaterial = rawMaterialRepository.getRawMaterialById(rawMaterialId),
    requiredQuantity = requiredQuantity
  )
}

fun FinishedGood.toEntity(): FinishedGoodEntity {
  return FinishedGoodEntity(
    id = id,
    name = name,
    rawMaterialId = rawMaterial.id,
    requiredQuantity = requiredQuantity
  )
}

fun FinishedGoodReceived.toEntity(): FinishedGoodReceivedEntity {
  return FinishedGoodReceivedEntity(
    id = id,
    fromFabricatorSlipNo = fromFabricatorSlipNo,
    deliverableId = deliverable.id,
    quantity = quantity
  )
}

fun FinishedGoodReceivedEntity.toDomainModel(
  deliverableRepository: DeliverableRepository
): FinishedGoodReceived {
  return FinishedGoodReceived(
    id = id,
    fromFabricatorSlipNo = fromFabricatorSlipNo,
    deliverable = deliverableRepository.getDeliverableById(deliverableId),
    quantity = quantity
  )
}

