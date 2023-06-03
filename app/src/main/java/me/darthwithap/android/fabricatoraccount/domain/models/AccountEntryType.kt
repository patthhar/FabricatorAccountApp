package me.darthwithap.android.fabricatoraccount.domain.models

sealed class AccountEntryType(val name: String) {
  data class CashPayment(val amount: Int = 0) :
    AccountEntryType("cashPayment")

  data class MaterialSent(
    val sentMaterials: List<FabricatorReceivable>? = null
  ) :
    AccountEntryType("materialSent")

  companion object {
    fun fromString(name: String): AccountEntryType {
      return when (name) {
        "cashPayment" -> CashPayment()
        "materialSent" -> MaterialSent()
        else -> CashPayment()
      }
    }
  }
}