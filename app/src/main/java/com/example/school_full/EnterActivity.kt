package com.example.school_full

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class EnterActivity : AppCompatActivity() {
    var username: String? = null
    var numberOfRemainingLoginAttempts = 3
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter)
        val showButton = findViewById<Button>(R.id.button_login)

        showButton.setOnClickListener {
            init()
        }
        auth = Firebase.auth
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            Toast.makeText(this, "user est", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "user net", Toast.LENGTH_SHORT).show()
        }
    }


    private fun init() {
        val edit_user = findViewById<EditText>(R.id.edit_user)
        val edit_pass = findViewById<EditText>(R.id.edit_password)
        val username: String = edit_user.text.toString()
        val password: String = edit_pass.text.toString()

        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Пустые поля", Toast.LENGTH_SHORT).show()
        }


        auth.signInWithEmailAndPassword(username, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information

                    val intent = Intent(this@EnterActivity, MainActivity::class.java)
                    intent.putExtra("username", username)
                    startActivity(intent)
                    Toast.makeText(baseContext, "Authentication succses.",
                        Toast.LENGTH_SHORT).show()

                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()

                }
            }

            .addOnFailureListener {
                Toast.makeText(baseContext, "Authentication failed. ${it.localizedMessage}",
                    Toast.LENGTH_SHORT).show()
            }



    }
}