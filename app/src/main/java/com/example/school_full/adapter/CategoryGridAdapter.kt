package com.example.school_full

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.school_full.model.CatQuiz
import com.squareup.picasso.Picasso

class CategoryGridAdapter (private val catList: ArrayList<CatQuiz>):
    RecyclerView.Adapter<CategoryGridAdapter.CategoryViewHolder>() {


    class CategoryViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val quizName: TextView = itemView.findViewById(R.id.quizNameTextView)
        val profileImage: ImageView = itemView.findViewById(R.id.quizImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryGridAdapter.CategoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.quizName.text = catList[position].quiz_name
        Picasso.get().load(catList[position].quiz_photoUrl)
            .fit()
            .into(holder.profileImage)
    }

    override fun getItemCount(): Int {
        return catList.size
    }


}