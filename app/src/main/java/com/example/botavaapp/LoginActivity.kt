package com.example.botavaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    var emailInput : String = ""
    var passwordInput : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnSave.setOnClickListener { validasiInput () }

    }

    private fun validasiInput() {
        emailInput = et_email.text.toString()
        passwordInput = et_password.text.toString()

        when{

            emailInput.isEmpty() -> et_email.error = "Email tidak boleh kosong"
            passwordInput.isEmpty() -> et_password.error = "Password tidak boleh kosong"
            ! android.util.Patterns.EMAIL_ADDRESS.matcher(emailInput).matches() -> et_email.error = "email tidak valid"

            else -> {
                //Toast.makeText(this, "Navigasi ke halaman Home", Toast.LENGTH_SHORT).show()
                tampilToast("Navigasi ke halaman Home")
                navigasiKeHome()
            }
        }
    }

    private fun navigasiKeHome() {

        val intent = Intent(this, HomeActivity::class.java)

        val bundle = Bundle()

        bundle.putString("email", emailInput)
        bundle.putString("password",passwordInput)

        intent.putExtras(bundle)

        startActivity(intent)

    }

    private fun tampilToast(message: String) {

    }


}
