package com.bignerdranchguide.crimeful.model

import androidx.lifecycle.ViewModel
import com.bignerdranchguide.crimeful.repository.CrimeRepository

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()

}