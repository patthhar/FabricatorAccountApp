package me.darthwithap.android.fabricatoraccount.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import me.darthwithap.android.fabricatoraccount.data.local.entity.DeliverableEntity

@Dao
interface DeliverableDao {

  @Upsert
  suspend fun upsertDeliverable(deliverableEntity: DeliverableEntity)

  @Delete
  suspend fun deleteDeliverable(deliverableEntity: DeliverableEntity)

  @Query("DELETE FROM DeliverableEntity WHERE fabricatorId=:id")
  suspend fun deleteDeliverablesForFabricator(id: String)

  @Query("""
    SELECT * FROM DeliverableEntity WHERE id=:id
  """)
  fun getDeliverableById(id: String): DeliverableEntity
}