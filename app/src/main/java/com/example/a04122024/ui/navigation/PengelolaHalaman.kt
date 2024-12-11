package com.example.a04122024.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a04122024.ui.view.mahasiswa.DestinasiInsert
import com.example.a04122024.ui.view.mahasiswa.InserMhsView

@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(navController = navController, startDestination = DestinasiInsert.route) {
        composable(
            route = DestinasiInsert.route
        ){
            InserMhsView(
                onBack = {}, onNavigate = {}
            )
        }
    }

}