package com.example.apptrivial

import android.content.Context
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.media.RouteDiscoveryPreference
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.apptrivial.ui.theme.AppTrivialTheme
import androidx.navigation.compose.rememberNavController
import com.example.apptrivial.components.CustomMediaPlayer
import com.example.apptrivial.components.CustomNavHost
import com.example.apptrivial.components.CustomTabRow



class MainActivity : ComponentActivity() {

    private lateinit var customMediaPlayer: CustomMediaPlayer
    private lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE)
        customMediaPlayer = CustomMediaPlayer(this,sharedPreferences)
        customMediaPlayer.CreateStart()


        setContent {
           App(customMediaPlayer,sharedPreferences)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        customMediaPlayer.Release()
    }

    override fun onStop() {
        super.onStop()
        customMediaPlayer.Pause()
    }

    override fun onResume() {
        super.onResume()
        customMediaPlayer.Start()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(customMediaPlayer: CustomMediaPlayer, sharedPreference: SharedPreferences) {

    AppTrivialTheme {
        val navController = rememberNavController()

        val currentBackStack by navController.currentBackStackEntryAsState()
        val currentDestination = currentBackStack?.destination
        val currentScreen = tabRowScreens.find { it.route == currentDestination?.route } ?: Quizzes


        Scaffold(
            topBar = {
                CustomTabRow(
                    allScreens = tabRowScreens,
                    onTabSelected = { newScreen ->
                        navController.navigate(newScreen.route){ launchSingleTop = true }
                    },
                    currentScreen = currentScreen
                )
            }
        ) { innerPadding ->
            CustomNavHost(
                navController = navController,
                modifier = Modifier.padding(innerPadding),
                cMediaPlayer = customMediaPlayer,
                sharedPreferences = sharedPreference
            )
        }
    }
}







