package com.example.school_full.model

data class Question(
    var question: String? = null, // Тема квиза
    var optionA: String? = null, // Имя человек
    var optionB: String? = null, // Имя человек
    var optionC: String? = null, // Имя человек
    var optionD: String? = null, // Имя человек
    var correctAns: Int? = null // Имя человек
)