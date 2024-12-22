package com.example.nearby.ui.screen.market_details

import com.example.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null
)