package com.example.moviles

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.moviles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    //Array de preguntas temporal
    private val questions = arrayOf("1","2")
    //Array de opciones temporal
    private val options = arrayOf(arrayOf("q", "b", "c", "o"), arrayOf("a","c","d","j"))
    //Array de repsuestas correctas temporal
    private val correctAnswers = arrayOf(1, 0)
    //Array de contador de pregntas
    private var currentQuestionIndex = 0
    //Array de puntos
    private var score = 0

    //Funicon al inicializar la aplicacion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayQuestion()

        binding.option1Button.setOnClickListener{
            checkAnswer(0)
        }
        binding.option2Button.setOnClickListener{
            checkAnswer(1)
        }
        binding.option3Button.setOnClickListener{
            checkAnswer(2)
        }
        binding.option4Button.setOnClickListener{
            checkAnswer(3)
        }

        binding.restartButton.setOnClickListener{
            restartQuiz()
        }
    }
    //Funcion al pulsar el boton correcto
    private fun correctButtonColors(buttonIndex: Int) {
        when (buttonIndex) {
            0 -> binding.option1Button.setBackgroundColor(Color.GREEN)

            1 -> binding.option2Button.setBackgroundColor(Color.GREEN)

            2 -> binding.option3Button.setBackgroundColor(Color.GREEN)

            3 -> binding.option4Button.setBackgroundColor(Color.GREEN)
        }
    }
    //Funcion al pulsar el boton incorrecto
    private fun wrongButtonColors(buttonIndex: Int) {
        when (buttonIndex) {
            0 -> binding.option1Button.setBackgroundColor(Color.RED)

            1 -> binding.option2Button.setBackgroundColor(Color.RED)

            2 -> binding.option3Button.setBackgroundColor(Color.RED)

            3 -> binding.option4Button.setBackgroundColor(Color.RED)
        }
    }
    //Funcion para resetear el color de los botones
    private fun resetButtonColors() {
        binding.option1Button.setBackgroundColor(Color.BLUE)
        binding.option2Button.setBackgroundColor(Color.BLUE)
        binding.option3Button.setBackgroundColor(Color.BLUE)
        binding.option4Button.setBackgroundColor(Color.BLUE)
    }
    //Funcion para mostrar el resultado
    private fun showResults() {
        Toast.makeText(this, "Your score: $score out of ${questions.size}", Toast.LENGTH_LONG)
            .show()
        binding.restartButton.isEnabled = true;
    }
    //Funcion para cambiar de pregunta
    private fun displayQuestion() {
        binding.questionText.text = questions[currentQuestionIndex]
        binding.option1Button.text = options[currentQuestionIndex][0]
        binding.option2Button.text = options[currentQuestionIndex][1]
        binding.option3Button.text = options[currentQuestionIndex][2]
        binding.option4Button.text = options[currentQuestionIndex][3]
        resetButtonColors()
    }
    //Funcion general que dictamina el uso general del cuestionario
    private fun checkAnswer(selectedAnswerIndex: Int) {

        val correctAnswerIndex = correctAnswers[currentQuestionIndex]

        if (selectedAnswerIndex == correctAnswerIndex) {
            score++
            correctButtonColors(selectedAnswerIndex)
        } else {
            wrongButtonColors(selectedAnswerIndex)
            correctButtonColors(correctAnswerIndex)
        }
        if (currentQuestionIndex < questions.size -1 ) {
            currentQuestionIndex++
            binding.questionText.postDelayed({ displayQuestion()}, 1000)
        } else {
            showResults()
        }

    }
    //Funcion que resetea el loop general
    private fun restartQuiz(){
        currentQuestionIndex = 0
        score = 0
        displayQuestion()
        binding.restartButton.isEnabled = false
    }
}



