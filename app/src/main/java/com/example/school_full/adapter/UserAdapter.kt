package com.example.school_full

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.school_full.databinding.ItemUserBinding
import com.example.school_full.model.User
import com.squareup.picasso.Picasso

class UserAdapter(private val userList: ArrayList<User>):
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val firstName: TextView = itemView.findViewById(R.id.userNameTextView)
        val clasName: TextView = itemView.findViewById(R.id.userClassTextView)
        val profileImage: ImageView = itemView.findViewById(R.id.photoImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.firstName.text = userList[position].first_name+ " " + userList[position].second_name
        holder.clasName.text = userList[position].clas
        Picasso.get().load(userList[position].photoUrl)
            .fit()
            .into(holder.profileImage)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}