package com.example.recyclertesttwo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cart_recyclerview_testing.R
import com.example.cart_recyclerview_testing.model.Food
import kotlinx.android.synthetic.main.item_food.view.*

class FoodAdapter(var foodList: ArrayList<Food>) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindFood(food: Food) {
            itemView.imgFood.setImageResource(food.imgfood)
            itemView.txtFood.text = food.food
            itemView.txtPrice.text = food.price
            itemView.txtWeight.text = food.weight
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bindFood(foodList[position])
    }
}