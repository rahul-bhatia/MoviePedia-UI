package com.rahul.moviepedia.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.elfalt.tmdb.repositories.RepositoryTvDetailsData
import com.rahul.moviepedia.remoteSource.TvResponseDetails

class TvDetailsViewModel(application: Application) : AndroidViewModel(application){

    fun getTvShowDetails(tvId : String): LiveData<TvResponseDetails> {
        return RepositoryTvDetailsData.getTvShowsDetails(tvId)
    }
}