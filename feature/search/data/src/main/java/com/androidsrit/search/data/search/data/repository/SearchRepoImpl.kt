package com.androidsrit.search.data.search.data.repository

import com.androidsrit.search.data.search.data.mappers.toDomain
import com.androidsrit.search.data.search.data.remote.SearchApiService
import com.androidsrit.search.domain.model.Recipie
import com.androidsrit.search.domain.model.RecipieDetails
import com.androidsrit.search.domain.repository.SearchRepository

class SearchRepoImpl(
    private val searchApiService: SearchApiService
) : SearchRepository {
    override suspend fun getRecipies(s: String): Result<List<Recipie>> {
        val response = searchApiService.getRecipies(s)
       return if(response.isSuccessful){
           response.body()?.meals?.let {
               Result.success(it.toDomain())
           }?: kotlin.run { Result.failure(Exception("No data found")) }

        }else{
            Result.failure(Exception(response.errorBody().toString()))
        }
    }


    override suspend fun getRecipieDetails(id:String): Result<RecipieDetails> {
        val response = searchApiService.getRecipieDetails(id)
        if (response.isSuccessful){
            response.body()?.meals?.let{
                if(it.isNotEmpty()){
                        it.toDomain()
                }else{
                    Result.failure(Exception("No data found"))
                }
                Result.success()
            }?:Result.failure(Exception("No data found"))
        }else{
            Result.failure(Exception("can't get your request from the server"))
        }
        TODO()
    }
}