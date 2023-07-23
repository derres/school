package com.example.school_full

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.ktx.storage


class EditProfile : AppCompatActivity() {

    private var storageRef = Firebase.storage
    private lateinit var changeProfileImage: ImageView
    private lateinit var closeButton: Button
    private lateinit var database: FirebaseDatabase
    private lateinit var filePath: Uri

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        closeButton = findViewById<Button>(R.id.button_close)




        closeButton.setOnClickListener {
            val intent = Intent(this@EditProfile, MainActivity::class.java)
            startActivity(intent)
        }



    }
}