package com.bignerdranchguide.crimeful.controller

import androidx.lifecycle.ViewModel
import com.bignerdranchguide.crimeful.model.Crime

class CrimeListViewModel : ViewModel() {
    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime
        }
    }
}