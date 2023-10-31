package com.example.moviles

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.moviles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private val questions = arrayOf("1,2,3")

    private val options = arrayOf(arrayOf("q", "b", "c", "o"), arrayOf("a,c,d,j"))

    private val correctAnswers = arrayOf(1, 0)

    private var currentQuestionIndex = 0

    private var score = 0

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

    private fun correctButtonColors(buttonIndex: Int) {
        when (buttonIndex) {
            0 -> binding.option1Button.setBackgroundColor(Color.GREEN)

            1 -> binding.option2Button.setBackgroundColor(Color.GREEN)

            2 -> binding.option3Button.setBackgroundColor(Color.GREEN)

            3 -> binding.option4Button.setBackgroundColor(Color.GREEN)
        }
    }

    private fun wrongButtonColors(buttonIndex: Int) {
        when (buttonIndex) {
            0 -> binding.option1Button.setBackgroundColor(Color.RED)

            1 -> binding.option2Button.setBackgroundColor(Color.RED)

            2 -> binding.option3Button.setBackgroundColor(Color.RED)

            3 -> binding.option4Button.setBackgroundColor(Color.RED)
        }
    }

    private fun resetButtonColors() {
        binding.option1Button.setBackgroundColor(Color.BLUE)
        binding.option2Button.setBackgroundColor(Color.BLUE)
        binding.option3Button.setBackgroundColor(Color.BLUE)
        binding.option4Button.setBackgroundColor(Color.BLUE)
    }

    private fun showResults() {
        Toast.makeText(this, "Your score: $score out of ${questions.size}", Toast.LENGTH_LONG)
            .show()
        binding.restartButton.isEnabled = true;
    }

    private fun displayQuestion() {
        binding.questionText.text = questions[currentQuestionIndex]
        binding.option1Button.text = options[currentQuestionIndex][0]
        binding.option2Button.text = options[currentQuestionIndex][1]
        binding.option3Button.text = options[currentQuestionIndex][2]
        binding.option4Button.text = options[currentQuestionIndex][3]
        resetButtonColors()
    }

    private fun checkAnswer(selectedAnswerIndex: Int) {

        val correctAnswerIndex = correctAnswers[currentQuestionIndex]

        if (selectedAnswerIndex == correctAnswerIndex) {
            score++
            correctButtonColors(selectedAnswerIndex)
        } else {
            wrongButtonColors(selectedAnswerIndex)
            correctButtonColors(correctAnswerIndex)
        }
        if (currentQuestionIndex < questions.size - 1) {
            currentQuestionIndex++
            binding.questionText.postDelayed({ displayQuestion() }, 1000)

        } else {
            showResults()
        }

    }

    private fun restartQuiz(){
        currentQuestionIndex = 0
        score = 0
        displayQuestion()
        binding.restartButton.isEnabled = false
    }
}



