package com.example.school_full

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class  CalendarUtility {

    lateinit var selectedDate: LocalDate
    fun formattedDate(date: LocalDate): String? {
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy")
        return date.format(formatter)
    }
    fun formattedTime(time: LocalTime): String? {
        val formatter = DateTimeFormatter.ofPattern("hh:mm:ss a")
        return time.format(formatter)
    }
    fun monthYearFromDate(date: LocalDate): String? {
        val formatter = DateTimeFormatter.ofPattern("MMMM yyyy")
        return date.format(formatter)
    }
    companion object {
        lateinit var selectedDate: LocalDate
        var flag: Boolean = false
        lateinit var day_lesson: Array<String>
    }


}