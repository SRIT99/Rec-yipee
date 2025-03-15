package com.androidsrit.search.data.search.data.mappers

import com.androidsrit.search.data.search.data.model.RecipieDTO
import com.androidsrit.search.domain.model.Recipie
import com.androidsrit.search.domain.model.RecipieDetails

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
fun RecipieDTO.toDomain():RecipieDetails{
    return RecipieDetails(
        idMeal = idMeal,
        strArea = strArea,
        strCategory = strCategory,
        strMeal = strMeal,
        strMealThumb = strMealThumb,
        strTags = strTags?:"",
        strYoutube = strYoutube?:"",
        strInstructions = strInstructions,
        ingredientsPair = this.getIngredientPairWithItsMeasure()
    )
}
fun RecipieDTO.getIngredientPairWithItsMeasure():List<Pair<String,String>>{
    val list = mutableListOf<Pair<String,String>>()
    for(i in 1..20){
        var ingredient:String = "strIngredient$i"
        var measure:String = "strMeasure$i"
       list.add(Pair(ingredient.getOrEmpty(), measure.getOrEmpty()))

    }
    return list
}
fun String?.getOrEmpty() = this?.ifEmpty { "" }?:""