package com.example.apptrivial.components



import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontVariation
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.apptrivial.Options
import com.example.apptrivial.Quiz1
import com.example.apptrivial.Quiz2
import com.example.apptrivial.Quiz3
import com.example.apptrivial.Quizzes
import com.example.apptrivial.screens.MainScreen
import com.example.apptrivial.screens.OptionsScreen
import com.example.apptrivial.screens.QuestionScreen

@Composable
fun CustomNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Quizzes.route,
        modifier = modifier
    ) {
        composable(route = Quizzes.route) {
            MainScreen(
                onQuiz1={
                    navController.navigate(Quiz1.route){ launchSingleTop = true }
                } ,
                onQuiz2={
                    navController.navigate(Quiz2.route){ launchSingleTop = true }
                } ,
                onQuiz3={
                    navController.navigate(Quiz3.route){ launchSingleTop = true }
                }
            )
        }
        composable(route = Options.route) {
            OptionsScreen()
        }
        composable(route = Quiz1.route){
            QuestionScreen(0)
        }
        composable(route = Quiz2.route){
            QuestionScreen(1)
        }
        composable(route = Quiz3.route){
            QuestionScreen(2)
        }
    }
}