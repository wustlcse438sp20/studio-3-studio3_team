package com.example.cse438.studio3

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.cse438_rest_studio.Network.BreweryRepository
import com.example.cse438_rest_studio.data.Brewery
import com.example.cse438_rest_studio.data.BreweryPayload


class BreweryViewModel(application: Application): AndroidViewModel(application) {
    public var breweryList: MutableLiveData<BreweryPayload> = MutableLiveData()

    public var breweryRepository: BreweryRepository = BreweryRepository()

    //TODO #8: Create a livedata object for tracking breweries
    fun getByCity(city: String){
        breweryRepository.getByCity(breweryList, city)
    }
    //TODO #9: Write functions to access the two brewery API calls from the repository
    fun getByTerm(term: String) {
        breweryRepository.getByTerm(breweryList, term)
    }
}