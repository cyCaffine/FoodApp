package com.menkashah.foodfood.ViewModel


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.menkashah.foodfood.Meal
import com.menkashah.foodfood.MealList
import com.menkashah.foodfood.Retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel(): ViewModel(){
    private var randomMealLiveData = MutableLiveData<Meal>()

    fun getRandomMeal(){
        RetrofitInstance.api.getRandomApi().enqueue(object: Callback<MealList> {
            override fun onResponse(call: Call<MealList>, response: Response<MealList>) {
                if(response.body() != null){
                    val randomMeal: Meal = response.body()!!.meals[0]
                    randomMealLiveData.value = randomMeal

                }else{
                    return
                }
            }

            override fun onFailure(call: Call<MealList>, t: Throwable) {
                Log.d("HomeFragment", t.message.toString());
            }
        })
//        function to listen  randomMealLiveData
        fun observerRandomMealLiveData() : LiveData<Meal>{
            return randomMealLiveData

        }

    }

    fun observerRandomMealLiveData(): LiveData<Meal> {
         return  randomMealLiveData
    }
}