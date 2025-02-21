package com.route.easyfood.pojo

import com.google.gson.annotations.SerializedName

data class MealsByCategoryList(

    @field:SerializedName("meals")
    val meals: List<MealsByCategory?>? = null
)