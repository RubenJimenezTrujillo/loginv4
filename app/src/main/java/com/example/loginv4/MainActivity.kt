package com.example.loginv4
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAuth:FirebaseAuth
    private  lateinit var auth: FirebaseAuth.AuthStateListener
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btningresar : Button = findViewById(R.id.ButtonAccess)
        val btnadd : Button = findViewById(R.id.ButtonAdd)
        val emailtxt : TextView =findViewById(R.id.emailText)
        val passtxt : TextView = findViewById(R.id.passwortText)

        btningresar.setOnClickListener(){

        }

    }
    private fun setup() {
        title= "Autenticacion"

       // ButtonAdd.setOnClickListener{

        }

    }



/*Hola este es un comentario de prueba*/


//fun main (){
   // print( "hola")


    // Write a message to the database
    //val database = Firebase.database
   // val myRef = database.getReference("message")

   // myRef.setValue("Hello, World!")
