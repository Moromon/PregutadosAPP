package com.example.ui
import androidx.lifecycle.ViewModel
import com.example.data.Question
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.data.QuestionsRepository

class QuestionEntryViewModel(private val questionsRepository: QuestionsRepository) : ViewModel() {

    /**
     * Holds current item ui state
     */
    var questionUIState by mutableStateOf(QuestionUiState())
        private set

    /**
     * Updates the [itemUiState] with the value provided in the argument. This method also triggers
     * a validation for input values.
     */
    fun updateUiState(questionDetails: QuestionDetails) {
        questionUIState =
            QuestionUiState(questionDetails = questionDetails, isEntryValid = validateInput(questionDetails))
    }

    private fun validateInput(uiState: QuestionDetails = questionUIState.questionDetails): Boolean {
        return with(uiState) {
            pregunta.isNotBlank() && opcion1.isNotBlank() && opcion2.isNotBlank() && opcion3.isNotBlank() && opcion4.isNotBlank()
        }
    }
    /*
    suspend fun saveItem() {
        if (validateInput()) {
            questionsRepository.insertItem(questionUIState.questionDetails.toQuestion())
        }
    }

     */
}
    data class QuestionUiState(
        val questionDetails: QuestionDetails = QuestionDetails(),
        val isEntryValid: Boolean = false
    )

    data class QuestionDetails(
        val id: Int = 0,
        val pregunta: String = "",
        val opcion1: String = "",
        val opcion2: String = "",
        val opcion3: String = "",
        val opcion4: String = "",
    )

    /**
     * Extension function to convert [ItemDetails] to [Item]. If the value of [ItemDetails.price] is
     * not a valid [Double], then the price will be set to 0.0. Similarly if the value of
     * [ItemDetails.quantity] is not a valid [Int], then the quantity will be set to 0
     */

    fun QuestionDetails.toQuestion(): Question = Question(
        id = id,
        pregunta = pregunta,
        opcion1 = opcion1,
        opcion2 = opcion2,
        opcion3 = opcion3,
        opcion4 = opcion4
    )

    /**
     * Extension function to convert [Item] to [ItemUiState]
     */
    fun Question.toQuestionUiState(isEntryValid: Boolean = false): QuestionUiState = QuestionUiState(
        questionDetails = this.toQuestionDetails(),
        isEntryValid = isEntryValid
    )

    /**
     * Extension function to convert [Item] to [ItemDetails]
     */
    fun Question.toQuestionDetails(): QuestionDetails = QuestionDetails(
        id = id,
        pregunta = pregunta,
        opcion1 = opcion1,
        opcion2 = opcion2,
        opcion3 = opcion3,
        opcion4 = opcion4
    )

