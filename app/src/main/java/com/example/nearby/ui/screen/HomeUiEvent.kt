package com.example.nearby.ui.screen

sealed class HomeUiEvent {
    data object OnFetchCategories : HomeUiEvent()
    data class OnFetchMarkets(val categoryId: String) : HomeUiEvent()
}