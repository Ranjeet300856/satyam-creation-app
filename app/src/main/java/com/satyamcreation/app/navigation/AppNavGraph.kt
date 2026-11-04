package com.satyamcreation.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.satyamcreation.app.home.HomeScreen

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = AppRoutes.Home.route
    ) {
        //Home Screen Destination
        composable(
            route = AppRoutes.Home.route
        ) {
            HomeScreen()
        }
    }
}