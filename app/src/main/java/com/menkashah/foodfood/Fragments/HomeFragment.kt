package com.menkashah.foodfood.Fragments



import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.menkashah.foodfood.Meal
import com.menkashah.foodfood.MealList
import com.menkashah.foodfood.Retrofit.RetrofitInstance
import com.menkashah.foodfood.ViewModel.HomeViewModel
import com.menkashah.foodfood.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {
private  lateinit var binding: FragmentHomeBinding
//created instance of HomeViewModel
private lateinit var homeMVVM: HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        initiate the homeView
        homeMVVM = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeMVVM.getRandomMeal()
        observerRandomMeal()


    }

    private fun observerRandomMeal() {
        homeMVVM.observerRandomMealLiveData().observe(viewLifecycleOwner,object :Observer<Meal>{
            override fun onChanged(value: Meal) {

                Glide.with(this@HomeFragment)
                    .load(value.strMealThumb)
                    .into(binding.randomMealImages)
            }

        })
    }


}