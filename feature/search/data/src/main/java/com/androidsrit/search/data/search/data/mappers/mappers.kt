package com.androidsrit.search.data.search.data.mappers

import com.androidsrit.search.data.search.data.model.RecipieDTO
import com.androidsrit.search.domain.model.Recipie

fun List<RecipieDTO>.toDomain(): List<Recipie> = map{
Recipie(
    idMeal = it.idMeal,
    strArea = it.strArea,
    strCategory = it.strCategory,
    strMeal = it.strMeal,
    strMealThumb = it.strMealThumb,
    strTags = it.strTags?:"",
    strYoutube = it.strYoutube?:"",
    strInstructions = it.strInstructions
)

}