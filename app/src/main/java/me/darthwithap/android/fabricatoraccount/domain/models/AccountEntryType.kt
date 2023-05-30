package me.darthwithap.android.fabricatoraccount.domain.models

sealed class AccountEntryType {
  data class CashPayment(val typeName: String, val amount: Int = 0) : AccountEntryType()
  data class MaterialSent(
    val typeName: String,
    val sentMaterials: List<FabricatorReceivable>? = null
  ) :
    AccountEntryType()

  companion object {
    fun fromString(name: String): AccountEntryType {
      return when (name) {
        "cashPayment" -> CashPayment(name)
        "materialSent" -> MaterialSent(name)
        else -> CashPayment(name)
      }
    }
  }
}