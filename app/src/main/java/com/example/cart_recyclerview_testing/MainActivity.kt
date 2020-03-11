package com.example.cart_recyclerview_testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cart_recyclerview_testing.model.Food
import com.example.recyclertesttwo.adapter.FoodAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var foodArray = ArrayList<Food>()
        foodArray.add(Food(R.drawable.sugar,"Fine Grain Sugar","Price-$20.00","1kg"))
        foodArray.add(Food(R.drawable.peanut,"Peanuts","Price-$20.00","3kg"))
        foodArray.add(Food(R.drawable.rice,"Dawat Rice","Price-$80.00","2kg"))

        var foodAdapter = FoodAdapter(foodArray)

        recyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager= GridLayoutManager(this,1)
        recyclerView.adapter=foodAdapter
    }
}
