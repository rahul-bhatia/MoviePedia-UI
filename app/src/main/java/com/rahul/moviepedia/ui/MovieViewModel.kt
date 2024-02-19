package com.rahul.moviepedia.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.elfalt.tmdb.repositories.RepositoryData
import com.elfalt.tmdb.ui.Movies

class MovieViewModel(application: Application) : AndroidViewModel(application) {

    init {
        RepositoryData.initDatabase(application)
    }

    fun getMovies(type : String, tBool :Int) : LiveData<List<Movies>>{
        return RepositoryData.getMovies(type, tBool)
    }

}