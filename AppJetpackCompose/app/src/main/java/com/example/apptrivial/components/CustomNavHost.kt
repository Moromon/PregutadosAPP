package com.example.apptrivial.components


import android.content.SharedPreferences
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.apptrivial.Options
import com.example.apptrivial.Quiz1
import com.example.apptrivial.Quiz2
import com.example.apptrivial.Quiz3
import com.example.apptrivial.Quizzes
import com.example.apptrivial.Score
import com.example.apptrivial.screens.MainScreen
import com.example.apptrivial.screens.OptionsScreen
import com.example.apptrivial.screens.QuestionScreen
import com.example.apptrivial.screens.ScoreScreen

@Composable
fun CustomNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    cMediaPlayer : CustomMediaPlayer,
    sharedPreferences: SharedPreferences

) {
    var scoreFinal by remember { mutableStateOf(0) }
    var timeElapsed by remember { mutableStateOf(0) }

    fun saveNumberOfQuestions(preferences: SharedPreferences, numberOfQuestions: Int) {
        val editor = preferences.edit()
        editor.putInt("nQuestions", numberOfQuestions)
        editor.apply()
    }
    fun getNumberOfQuestions(preferences: SharedPreferences): Int {
        return preferences.getInt("nQuestions", 10)
    }

    NavHost(
        modifier= Modifier.fillMaxSize(),
        navController = navController,
        startDestination = Quizzes.route,
    ) {
        composable(route = Quizzes.route) {
            MainScreen(
                onQuiz1 = {
                    navController.navigate(Quiz1.route) { launchSingleTop = true }
                },
                onQuiz2 = {
                    navController.navigate(Quiz2.route) { launchSingleTop = true }
                },
                onQuiz3 = {
                    navController.navigate(Quiz3.route) { launchSingleTop = true }
                },
                onOptions = {
                    navController.navigate(Options.route) { launchSingleTop = true }
                }
            )
        }
        composable(route = Options.route) {
            OptionsScreen( getNumberOfQuestions(sharedPreferences),updateData = { questions ->
                saveNumberOfQuestions(sharedPreferences, questions)

            },updateMusic = {mutedSong -> cMediaPlayer.UpdatePreferences(mutedSong)},
                onMenu = {navController.navigate(Quizzes.route) { launchSingleTop = true }}
            )
        }
        composable(route = Quiz1.route) {
            QuestionScreen(goScoreScreen = { score, time ->
                scoreFinal = score
                timeElapsed = time
                navController.navigate(Score.route) { launchSingleTop = true }
            }, 0, getNumberOfQuestions(sharedPreferences))
        }
        composable(route = Quiz2.route) {
            QuestionScreen(goScoreScreen = { score, time ->
                scoreFinal = score
                timeElapsed = time
                navController.navigate(Score.route) { launchSingleTop = true }
            }, 1, getNumberOfQuestions(sharedPreferences))
        }
        composable(route = Quiz3.route) {
            QuestionScreen(goScoreScreen = { score, time ->
                scoreFinal = score
                timeElapsed = time
                navController.navigate(Score.route) { launchSingleTop = true }
            }, 2, getNumberOfQuestions(sharedPreferences))
        }
        composable(route = Score.route) {
            ScoreScreen(
                scoreFinal,
                timeElapsed,
                toMainMenu = { navController.navigate(Quizzes.route) { launchSingleTop = true } })
        }
    }
}