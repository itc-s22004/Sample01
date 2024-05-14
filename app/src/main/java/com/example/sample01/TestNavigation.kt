package com.example.sample01

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sample01.Scene.StartScene

object Destinations {
    const val START = "start"
    const val SECOND = "second"
}

@Composable
fun TestNavigation(
    navController: NavHostController = rememberNavController(),
) {
    var titleText by remember {
        mutableStateOf("aaa")
    }
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Scaffold(
            topBar = {

            },
        ) {
            NavHost(
                navController = navController,
                startDestination = Destinations.START,
                modifier = Modifier.padding(it)
            ) {
                composable(Destinations.START) {
                    StartScene()
                }

                composable(Destinations.SECOND) {

                }
            }
        }
    }
}