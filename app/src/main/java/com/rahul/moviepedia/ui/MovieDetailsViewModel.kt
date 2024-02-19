package com.rahul.moviepedia.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.elfalt.tmdb.repositories.RepositoryMovieDetailsData
import com.rahul.moviepedia.remoteSource.MovieResponseDetails

class MovieDetailsViewModel(application: Application) : AndroidViewModel(application) {

    fun getMovieDetails(movieId : String) : LiveData<MovieResponseDetails> {
        return RepositoryMovieDetailsData.getMovieDetail(movieId)
    }
}