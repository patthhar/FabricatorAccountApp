package me.darthwithap.android.fabricatoraccount.data.mapper

import me.darthwithap.android.fabricatoraccount.data.local.entity.ReceivableEntity
import me.darthwithap.android.fabricatoraccount.domain.models.FabricatorReceivable

fun FabricatorReceivable.toEntity(): ReceivableEntity {
  return ReceivableEntity(
    itemName, quantity, costToFabricator
  )
}

fun ReceivableEntity.toDomainModel(): FabricatorReceivable {
  return FabricatorReceivable(
    itemName, quantity, costToFabricator
  )
}