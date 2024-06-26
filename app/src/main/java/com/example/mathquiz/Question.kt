package com.example.mathquiz

//question class for app
data class Question(
    val question: String,
    val options: List<String>,
    val correctOption: Int
)