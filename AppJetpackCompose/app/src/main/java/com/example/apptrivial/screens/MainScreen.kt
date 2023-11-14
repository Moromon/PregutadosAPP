package com.example.apptrivial.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apptrivial.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.offset
import android.content.res.Resources
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(
    onQuiz1: () -> Unit = {},
    onQuiz2: () -> Unit = {},
    onQuiz3: () -> Unit = {},
    onOptions: () ->Unit = {}
) {
    val image = painterResource(R.drawable.fondo1)
    val imageModifier = Modifier
        .fillMaxSize()

    val context = LocalContext.current

    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = imageModifier
    )
    Column(
        modifier = Modifier
            .offset(y = 400.dp)
            .padding(horizontal = 30.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        Button(
            onClick = { onQuiz1() }, modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .size(0.dp, 50.dp)
        ) { Text( context.getString(R.string.quizzGame1), style = TextStyle(fontSize = 20.sp)) }
        Button(
            onClick = { onQuiz2() }, modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .size(0.dp, 50.dp)
        ) { Text(context.getString(R.string.quizzGame2), style = TextStyle(fontSize = 20.sp)) }
        Button(
            onClick = { onQuiz3() }, modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .size(0.dp, 50.dp)
        ) { Text(context.getString(R.string.quizzGame3), style = TextStyle(fontSize = 20.sp)) }
        Button(
            onClick = { onOptions() }, modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .size(0.dp, 50.dp)
        ) { Text(context.getString(R.string.options), style = TextStyle(fontSize = 20.sp)) }


    }
}


@Preview(showBackground = true)
@Composable
fun MainScreen_preview() {
    MainScreen()
}
