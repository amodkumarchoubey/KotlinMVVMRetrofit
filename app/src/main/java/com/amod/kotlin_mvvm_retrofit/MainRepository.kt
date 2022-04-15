package com.amod.kotlin_mvvm_retrofit

import retrofit2.Response

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}