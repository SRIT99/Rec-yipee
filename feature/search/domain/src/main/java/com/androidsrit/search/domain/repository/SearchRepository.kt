package com.androidsrit.search.domain.repository

import com.androidsrit.search.domain.model.Recipie
import com.androidsrit.search.domain.model.RecipieDetails

interface SearchRepository {
    suspend fun getRecipies(s: String):Result<List<Recipie>>

    suspend fun getRecipieDetails(id:String): Result<RecipieDetails>
}