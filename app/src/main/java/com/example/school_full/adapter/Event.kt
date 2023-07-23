package com.example.school_full.model

import java.time.LocalDate
import java.time.LocalTime


class Event(private var name: String,private var date: LocalDate, private var time: LocalTime) {

    var eventsList: ArrayList<Event> = ArrayList()

    fun eventsForDate(date: LocalDate): ArrayList<Event> {
        val events: ArrayList<Event> = ArrayList()
        for (event in eventsList) {
            if (event.getDate().equals(date)) events.add(event)
        }
        return events
    }
    fun Event(name: String, date: LocalDate, time: LocalTime) {
        this.name = name
        this.date = date
        this.time = time
    }


    fun getDate(): LocalDate {
        return date
    }

    fun getName(): String {
        return name
    }

    fun getTime(): LocalTime {
        return time
    }

    fun setName(name: String) {
        this.name = name
    }


    fun setDate(date: LocalDate) {
        this.date = date
    }


    fun setTime(time: LocalTime) {
        this.time = time
    }






}