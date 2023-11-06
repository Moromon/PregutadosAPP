package com.example.apptrivial.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apptrivial.R

@Composable
fun ScoreScreen(
    scoreFinal: Int,
    timeElapsed: Int,
    toMainMenu: () -> Unit = {}

) {
    val image = painterResource(R.drawable.fondo2)
    val imageModifier = Modifier
        .fillMaxSize()



    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = imageModifier
    )
    Column(
        modifier = Modifier
            .offset(y = 120.dp)
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Has acertado $scoreFinal preguntas", color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .offset(0.dp, 0.dp)
                .fillMaxWidth()
                )
        Text("Has tardado $timeElapsed segundos", color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .offset(0.dp, 20.dp)
                .fillMaxWidth()
                )
        Text("Tu puntuación final: " + (scoreFinal * 1000) / timeElapsed + " puntos", color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .offset(0.dp, 40.dp)
                .fillMaxWidth()
                )


    }
    Box(modifier = Modifier
        .offset(0.dp, 400.dp)
        .padding(horizontal = 30.dp)) {
        Button(
            onClick = { toMainMenu() },
            Modifier
                .fillMaxWidth()
                .size(0.dp, 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text("Menú Principal", style = TextStyle(fontSize = 20.sp))
        }
    }
}