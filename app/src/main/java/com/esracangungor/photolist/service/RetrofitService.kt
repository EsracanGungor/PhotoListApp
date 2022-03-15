package com.esracangungor.photolist.service

import com.esracangungor.photolist.model.PhotoList
import retrofit2.http.GET

interface RetrofitService {

    @GET("list")
    suspend fun getDataFromApi(): PhotoList
}