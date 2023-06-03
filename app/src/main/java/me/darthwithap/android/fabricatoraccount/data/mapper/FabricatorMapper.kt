package me.darthwithap.android.fabricatoraccount.data.mapper

import me.darthwithap.android.fabricatoraccount.data.local.entity.DeliverableEntity
import me.darthwithap.android.fabricatoraccount.data.local.entity.FabricatorEntity
import me.darthwithap.android.fabricatoraccount.domain.models.Fabricator
import me.darthwithap.android.fabricatoraccount.domain.models.FabricatorDeliverable
import me.darthwithap.android.fabricatoraccount.domain.repository.FabricatorRepository
import me.darthwithap.android.fabricatoraccount.domain.repository.FinishedGoodRepository

fun Fabricator.toEntity(): FabricatorEntity {
  return FabricatorEntity(id, name)
}


// TODO: Implement getting all deliverables for the particular fabricator entity
// and adding it in the domain model fabricator
fun FabricatorEntity.toDomainModel(): Fabricator {
  return Fabricator(id, name)
}

fun FabricatorDeliverable.toEntity(): DeliverableEntity {
  return DeliverableEntity(
    fabricator.id,
    finishedGood.id,
    chargePerUnit
  )
}

//TODO: Think of a better approach here, maybe even introduce a callback from the viewModel
fun DeliverableEntity.toDomainModel(
  fabricatorRepository: FabricatorRepository,
  finishedGoodRepository: FinishedGoodRepository
): FabricatorDeliverable {
  return FabricatorDeliverable(
    id = id.toString(),
    fabricator = fabricatorRepository.getFabricatorById(fabricatorId),
    finishedGood = finishedGoodRepository.getFinishedGoodById(finishedGoodId),
    chargePerUnit
  )
}