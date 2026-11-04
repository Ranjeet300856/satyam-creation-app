package com.satyamcreation.app.navigation

sealed class AppRoutes(
    val route: String,
) {
    data object Home : AppRoutes("home")
}