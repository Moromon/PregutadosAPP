package com.example.apptrivial.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScoreScreen(
    scoreFinal: Int,
    timeElapsed: Int,
    toMainMenu:()-> Unit = {}

) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text( "Has acertado $scoreFinal preguntas")
        Text( "Has tardado $timeElapsed segundos")
        Text("Tu puntuación final es de "+(scoreFinal*1000)/timeElapsed+" puntos")

        Button(onClick = { toMainMenu() }) {
            Text("Volver al menu")
        }
    }
}