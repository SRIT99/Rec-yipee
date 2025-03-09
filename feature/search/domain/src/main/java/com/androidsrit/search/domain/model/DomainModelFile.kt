package com.androidsrit.search.domain.model

data class Recipie(
    val idMeal: String,
    val strArea: String,
    val strCategory: String,
    val  strMeal: String,
    val strMealThumb: String,
    val strInstructions: String,
    val strYoutube: String,
   val strTags : String,
)

data class RecipieDetails(
    val idMeal: String,
    val strArea: String,
    val strCategory: String,
    val  strMeal: String,
    val strMealThumb: String,
    val strInstructions: String,
    val strYoutube: String,
    val strTags: String,
    val ingredientsPair : List<Pair<String,String>>
)