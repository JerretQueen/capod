package eu.darken.capod.common.upgrade.core.data

import com.android.billingclient.api.ProductDetails

data class Sku(
    val id: String
) {
    data class Details(
        val sku: Sku,
        val details: Collection<ProductDetails>,
    )
}