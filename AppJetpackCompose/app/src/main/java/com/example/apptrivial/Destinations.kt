package com.example.apptrivial

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Gamepad
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector


interface Destination {
    val icon: ImageVector
    val route: String
}

object Quizzes : Destination {
    override val icon = Icons.Filled.Gamepad
    override val route = "Quizzes"
}

object Options : Destination {
    override val icon = Icons.Filled.Settings
    override val route = "Options"
}
object Quiz1:Destination {
    override val route = "Quiz1"
    override val icon = Icons.Filled.Gamepad
}
object Quiz2:Destination {
    override val route = "Quiz2"
    override val icon = Icons.Filled.Gamepad
}
object Quiz3:Destination {
    override val route = "Quiz3"
    override val icon = Icons.Filled.Gamepad
}
object Score:Destination {
    override val route = "Score"
    override val icon = Icons.Filled.Gamepad
}

// Screens to be displayed in the top RallyTabRow
val tabRowScreens = listOf(Quizzes, Options)