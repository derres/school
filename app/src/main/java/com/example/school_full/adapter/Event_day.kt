package com.example.school_full.adapter

import java.time.LocalDate
import java.time.LocalTime


class Event(var name: String, var date: LocalDate, var time: LocalTime) {
    companion object {
        var eventsList: ArrayList<Event> = ArrayList()
        fun eventsForDate(date: LocalDate): ArrayList<Event> {
            val events: ArrayList<Event> = ArrayList()
            for (event in eventsList) {
                if (event.date == date) events.add(event)
            }
            return events
        }
    }
}

