package com.example.android_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val user: EditText = findViewById(R.id.ed_user)
        val password: EditText = findViewById(R.id.ed_password)
        val login: Button = findViewById(R.id.bt_enter)
        login.setOnClickListener {
            checkInformationLogin(user.text.toString(), password.text.toString())
        }

    }

    private fun checkInformationLogin(userInput: String, passwordInput: String) {
        if (userInput.isNotEmpty() && passwordInput.isNotEmpty()) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else {
            if (userInput.isEmpty() && passwordInput.isNotEmpty()) {
                Toast.makeText(this, "Please input user.", Toast.LENGTH_SHORT).show()
            }
            if (passwordInput.isEmpty() && userInput.isNotEmpty()) {
                Toast.makeText(this, "Please input password.", Toast.LENGTH_SHORT).show()
            }
            if (userInput.isEmpty() && passwordInput.isEmpty()) {
                Toast.makeText(this, "Please input user & Password.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}