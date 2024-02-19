package com.rahul.moviepedia.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.elfalt.tmdb.repositories.RepositoryTvShowData
import com.rahul.moviepedia.remoteSource.TvShow

class TvShowsViewModel(application: Application) : AndroidViewModel(application) {

    fun getTvShows(tvType : String) : LiveData<List<TvShow>> {
        return RepositoryTvShowData.getTvShows(tvType)
    }
}