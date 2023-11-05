package com.example.apptrivial.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apptrivial.Question
import com.example.apptrivial.questionsTema1
import com.example.apptrivial.questionsTema2
import com.example.apptrivial.questionsTema3


@Composable
fun QuestionScreen(
    indx:Int
) {
    var questions = listOf<Question>()
    if(indx==0)questions = questionsTema1
    if(indx==1)questions = questionsTema2
    if(indx==2)questions = questionsTema3

    var rememberedInt by remember { mutableStateOf(0) }
    val (questionText, setQuestionText) = remember { mutableStateOf("a") }
    val (button1Text, setButton1Text) = remember { mutableStateOf("a") }
    val (button2Text, setButton2Text) = remember { mutableStateOf("b") }
    val (button3Text, setButton3Text) = remember { mutableStateOf("c") }
    val (button4Text, setButton4Text) = remember { mutableStateOf("d") }

    fun StartQuiz() {
        setQuestionText(questions[rememberedInt].question)
        setButton1Text(questions[rememberedInt].options[0])
        setButton2Text(questions[rememberedInt].options[1])
        setButton3Text(questions[rememberedInt].options[2])
        setButton4Text(questions[rememberedInt].options[3])
    }

    fun NextQuestion(){
        setQuestionText(questions[rememberedInt].question)
        setButton1Text(questions[rememberedInt].options[0])
        setButton2Text(questions[rememberedInt].options[1])
        setButton3Text(questions[rememberedInt].options[2])
        setButton4Text(questions[rememberedInt].options[3])

    }
    fun CheckAnswer(indx : Int ){


        rememberedInt++
        NextQuestion()
    }


    LaunchedEffect(Unit) {
            StartQuiz()
        }

    Column(
        modifier = Modifier
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,



        ) {
        Text(questionText)
        Button(onClick = { CheckAnswer(0) }, modifier = Modifier.fillMaxWidth()) { Text(button1Text) }
        Button(onClick = { CheckAnswer(1) }, modifier = Modifier.fillMaxWidth()) { Text(button2Text) }
        Button(onClick = { CheckAnswer(2)}, modifier = Modifier.fillMaxWidth()) { Text(button3Text) }
        Button(onClick = { CheckAnswer(3) }, modifier = Modifier.fillMaxWidth()) { Text(button4Text) }


    }
}


@Preview(showBackground = true)
@Composable
fun QuestionScreen_preview(){
    //QuestionScreen(0)
}




