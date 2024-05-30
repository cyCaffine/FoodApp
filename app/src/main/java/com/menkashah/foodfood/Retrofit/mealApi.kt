package com.menkashah.foodfood.Retrofit


import com.menkashah.foodfood.MealList
import retrofit2.Call
import retrofit2.http.GET

interface mealApi {


     @GET("random.php")
     fun getRandomApi(): Call<MealList>
}