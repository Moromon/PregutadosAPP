package com.example.apptrivial.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    onQuiz1: () -> Unit = {},
    onQuiz2: () -> Unit = {},
    onQuiz3: () -> Unit = {}
) {    Column(
    modifier = Modifier
        .padding(16.dp)


) {
    Button(onClick = { onQuiz1() },modifier = Modifier.fillMaxWidth()) {Text("Conocimiento general")}
    Button(onClick = { onQuiz2() },modifier = Modifier.fillMaxWidth()) {Text("Historia")}
    Button(onClick = { onQuiz3() },modifier = Modifier.fillMaxWidth()) {Text("Fun Facts")}


}}


@Preview(showBackground = true)
@Composable
fun MainScreen_preview(){
    MainScreen()
}
