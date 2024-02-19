package com.rahul.moviepedia.remoteSource

data class TvResponse(val results : List<TvShow>)

data class TvShow (val poster_path : String, val original_name: String, val id : Int)