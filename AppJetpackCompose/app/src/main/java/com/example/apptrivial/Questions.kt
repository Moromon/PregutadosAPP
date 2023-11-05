package com.example.apptrivial

data class Question(
    val question: String, // El texto de la pregunta
    val options: List<String>, // Lista de opciones de respuesta
    val correctAnswer: Int // El índice de la respuesta correcta en la lista de opciones
)



val questionsTema1 = listOf(
    Question("Pregunta 1", listOf("Opción 1", "Opción 1", "Opción 1","Opcion 1"), 0, ),
    Question("Pregunta 2", listOf("Opción 2", "Opción 2", "Opción 2","Opcion 2"), 1, ),
    Question("Pregunta 3", listOf("Opción 2", "Opción 2", "Opción 2","Opcion 2"), 3, ),
    Question("Pregunta 5", listOf("Opción 2", "Opción 2", "Opción 2","Opcion 2"), 2, ),
    Question("Pregunta 7", listOf("Opción 2", "Opción 2", "Opción 2","Opcion 2"), 1, ),
    Question("Pregunta 21", listOf("Opción 2", "Opción 2", "Opción 2","Opcion 2"), 0, ),
)

val questionsTema2= listOf(
    Question("Pregunta 3", listOf("Opción 3", "Opción 3", "Opción 3","Opcion 3"), 2, ),
    Question("Pregunta 4", listOf("Opción 4", "Opción 4", "Opción 4","Opcion 4"), 0, ),
)

val questionsTema3 = listOf(
    Question("Pregunta 5", listOf("Opción 5", "Opción 5", "Opción 5","Opcion 5"), 1, ),
    Question("Pregunta 6", listOf("Opción 6", "Opción 6", "Opción 6","Opcion 6"), 2, ),
)