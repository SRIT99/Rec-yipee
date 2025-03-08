package com.androidsrit.search.data.search.data.remote

import com.androidsrit.search.data.search.data.model.RecipieDetailsResponse
import com.androidsrit.search.data.search.data.model.RecipieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchApiService {

    @GET("api/json/v1/1/search.php")
    suspend fun getRecipies(
        @Query("s") s:String


    ): Response<RecipieResponse>
    //https://www.themealdb.com/api/json/v1/1/search.php?s=chicken


    //https://www.themealdb.com/api/json/v1/1/lookup.php?s=chicken
    @GET("api/json/v1/1/lookup.php")
    suspend fun getRecipieDetails(
        @Query("i") i:String

    ): Response<RecipieDetailsResponse>

}