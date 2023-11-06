package com.example.apptrivial.screens


import android.os.Handler
import android.os.Looper
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
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
import com.example.apptrivial.Question
import com.example.apptrivial.questionsTema1
import com.example.apptrivial.questionsTema2
import com.example.apptrivial.questionsTema3

import androidx.compose.runtime.MutableState

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apptrivial.R
import kotlinx.coroutines.flow.callbackFlow
import java.util.Timer
import java.util.TimerTask


@Composable
fun QuestionScreen(
    goScoreScreen: (Int, Int) -> Unit = { _, _ -> },
    indx: Int,
    nQuestion: Int,

    ) {
    var questions =  listOf<Question>()
    if (indx == 0) questions = questionsTema1
    if (indx == 1) questions = questionsTema2
    if (indx == 2) questions = questionsTema3

    var progress by remember { mutableStateOf(0f) }

    var maxQuestions = remember { mutableStateOf(0) }
    maxQuestions.value = nQuestion

    var questionIndx by remember { mutableStateOf(0) }
    var score by remember { mutableStateOf(0) }

    var lastQuestion by remember { mutableStateOf(false) }

    var buttonColor1 = remember { mutableStateOf(Color.Black) }
    var buttonColor2 = remember { mutableStateOf(Color.Black) }
    var buttonColor3 = remember { mutableStateOf(Color.Black) }
    var buttonColor4 = remember { mutableStateOf(Color.Black) }

    var enabledButton by remember { mutableStateOf(true) }

    var listOfColors =
        listOf<MutableState<Color>>(buttonColor1, buttonColor2, buttonColor3, buttonColor4)

    val (questionText, setQuestionText) = remember { mutableStateOf("a") }
    val (button1Text, setButton1Text) = remember { mutableStateOf("a") }
    val (button2Text, setButton2Text) = remember { mutableStateOf("b") }
    val (button3Text, setButton3Text) = remember { mutableStateOf("c") }
    val (button4Text, setButton4Text) = remember { mutableStateOf("d") }

    val handler = Handler(Looper.getMainLooper())

    val elapsedTimer = remember { Timer() }
    var elapsedTime by remember { mutableStateOf(0L) }

    fun CalculateProgress() {
        progress = (questionIndx.toFloat() / maxQuestions.value.toFloat())
    }

    fun StartQuiz() {

        setQuestionText(questions[questionIndx].question)
        setButton1Text(questions[questionIndx].options[0])
        setButton2Text(questions[questionIndx].options[1])
        setButton3Text(questions[questionIndx].options[2])
        setButton4Text(questions[questionIndx].options[3])
    }

    fun NextQuestion() {
        buttonColor1.value = Color.Black
        buttonColor2.value = Color.Black
        buttonColor3.value = Color.Black
        buttonColor4.value = Color.Black
        setQuestionText(questions[questionIndx].question)
        setButton1Text(questions[questionIndx].options[0])
        setButton2Text(questions[questionIndx].options[1])
        setButton3Text(questions[questionIndx].options[2])
        setButton4Text(questions[questionIndx].options[3])
        println(questions[questionIndx].correctAnswer)
        enabledButton = true

    }

    fun WaitNextQuestion() {
        handler.postDelayed({ NextQuestion() }, 2000)
    }

    fun ShowAnswers(indx: Int) {
        buttonColor1.value = Color.hsl(0f,0.76f,0.25f,1f)
        buttonColor2.value = Color.hsl(0f,0.76f,0.25f,1f)
        buttonColor3.value = Color.hsl(0f,0.76f,0.25f,1f)
        buttonColor4.value = Color.hsl(0f,0.76f,0.25f,1f)
        listOfColors[indx].value = Color.hsl(104f,0.72f,0.34f,1f)
    }

    fun StartElapsedTimer() {
        elapsedTimer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                elapsedTime += 1000
            }
        }, 0, 1000)
    }

    fun formatElapsedTime(timeInMillis: Long): String {
        val seconds = (timeInMillis / 1000) % 60
        val minutes = (timeInMillis / (1000 * 60)) % 60

        return String.format("%02d:%02d", minutes, seconds)
    }

    fun CheckAnswer(indx: Int) {
        enabledButton = false
        if (questions[questionIndx].correctAnswer == indx) {
            score++
        }
        ShowAnswers(questions[questionIndx].correctAnswer)

        questionIndx++
        CalculateProgress()
        lastQuestion = if (maxQuestions.value <= questionIndx) true else false
        if (!lastQuestion) WaitNextQuestion()
        else {
            goScoreScreen(score, elapsedTime.toInt() / 1000)
        }
    }

    val image = painterResource(R.drawable.fondo2)
    val imageModifier = Modifier
        .fillMaxSize()


    LaunchedEffect(Unit) {
        StartQuiz()
        StartElapsedTimer()
    }

    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = imageModifier
    )
    Column(
        modifier = Modifier
            .offset(y = 80.dp)
            .padding(horizontal = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        Text(
            "Tiempo: ${formatElapsedTime(elapsedTime)}", color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
        )
        Text(
            "$questionIndx/${maxQuestions.value}", color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.offset(0.dp, 10.dp)
        )
        LinearProgressIndicator(
            progress = progress,
            modifier = Modifier
                .fillMaxWidth()
                .padding(36.dp)
                .size(0.dp, 10.dp)
                .offset(0.dp, -20.dp),
            color = Color.Green,
            trackColor = Color.Black
        )

        Text(
            questionText, color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            modifier = Modifier
                .offset(0.dp, -90.dp)
                .fillMaxWidth()
                .padding(45.dp)
        )

    }
    Column(
        modifier = Modifier
            .offset(y = 400.dp)
            .padding(horizontal = 30.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


        Button(
            onClick = { if (enabledButton) CheckAnswer(0) },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .size(0.dp, 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = buttonColor1.value),

            ) { Text(button1Text,style = TextStyle(fontSize = 20.sp)) }
        Button(
            onClick = { if (enabledButton) CheckAnswer(1) },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .size(0.dp, 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = buttonColor2.value),


            ) { Text(button2Text,style = TextStyle(fontSize = 20.sp)) }
        Button(
            onClick = { if (enabledButton) CheckAnswer(2) },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .size(0.dp, 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = buttonColor3.value),

            ) { Text(button3Text,style = TextStyle(fontSize = 20.sp)) }
        Button(
            onClick = { if (enabledButton) CheckAnswer(3) },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .size(0.dp, 50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = buttonColor4.value),

            ) { Text(button4Text,style = TextStyle(fontSize = 20.sp)) }

    }

}


@Preview(showBackground = true)
@Composable
fun QuestionScreen_preview() {
    //QuestionScreen(0)
}




