package com.example.loginv4
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
//import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var auth: FirebaseAuth.AuthStateListener
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btningresar: Button = findViewById(R.id.ButtonAccess)
        val btnadd: Button = findViewById(R.id.ButtonAdd)
        val emailtxt: TextView = findViewById(R.id.emailText)
        val passtxt: TextView = findViewById(R.id.passwortText)
        firebaseAuth = Firebase.auth
        btningresar.setOnClickListener() {
            if(emailtxt.text.isNotEmpty() && passtxt.text.isNotEmpty()){
                singIn(emailtxt.text.toString(), passtxt.text.toString())
            }
            else{
                Toast.makeText(baseContext, "Error de email y/o contrasena esta en blanco", Toast.LENGTH_SHORT)
                    .show()

            }



        }

    }

    private fun singIn(email: String, password: String) {

        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this) {

                task ->


            if (task.isSuccessful) {
                val user = firebaseAuth.currentUser
                Toast.makeText(baseContext, user?.uid.toString(), Toast.LENGTH_SHORT).show()

                val i = Intent(this, inicio::class.java)
                startActivity(i)
            } else {
                Toast.makeText(baseContext, "Error de email y/o contrasena", Toast.LENGTH_SHORT)
                    .show()
            }

        }


    }






        }






/*Hola este es un comentario de prueba*/


//fun main (){
   // print( "hola")


    // Write a message to the database
    //val database = Firebase.database
   // val myRef = database.getReference("message")

   // myRef.setValue("Hello, World!")
