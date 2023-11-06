package com.example.apptrivial.components


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
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
    modifier: Modifier = Modifier
) {
    var scoreFinal by remember { mutableStateOf(0) }
    var timeElapsed by remember { mutableStateOf(0) }
    var nQuestions by remember { mutableStateOf(10) }

    NavHost(
        navController = navController,
        startDestination = Quizzes.route,
        modifier = modifier
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
                }
            )
        }
        composable(route = Options.route) {
            OptionsScreen(nQuestions,updateData = { questions ->
                nQuestions = questions

            })
        }
        composable(route = Quiz1.route) {
            QuestionScreen(goScoreScreen = { score, time ->
                scoreFinal = score
                timeElapsed = time
                navController.navigate(Score.route) { launchSingleTop = true }
            }, 0, nQuestions)
        }
        composable(route = Quiz2.route) {
            QuestionScreen(goScoreScreen = { score, time ->
                scoreFinal = score
                timeElapsed = time
                navController.navigate(Score.route) { launchSingleTop = true }
            }, 1, nQuestions)
        }
        composable(route = Quiz3.route) {
            QuestionScreen(goScoreScreen = { score, time ->
                scoreFinal = score
                timeElapsed = time
                navController.navigate(Score.route) { launchSingleTop = true }
            }, 2, nQuestions)
        }
        composable(route = Score.route) {
            ScoreScreen(
                scoreFinal,
                timeElapsed,
                toMainMenu = { navController.navigate(Quizzes.route) { launchSingleTop = true } })
        }
    }
}