package com.example.school_full
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_main)
        val user = Firebase.auth.currentUser
        val database = Firebase.database
        val myDB = FirebaseFirestore.getInstance()
        val intent = intent
        val str = intent.getStringExtra("username")
        val planetEarthDoc = myDB.collection("USERS")
            .document("$str")

        planetEarthDoc.get().addOnSuccessListener {
            Toast.makeText(baseContext, "Нужно ли оно?",
                Toast.LENGTH_SHORT).show()
            val editText = findViewById<TextView>(R.id.textview_name)
            editText.setText("${it.get("name")}")
        }
    }


}