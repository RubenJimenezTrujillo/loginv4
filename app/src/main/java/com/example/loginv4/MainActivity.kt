package com.example.loginv4
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
       // setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val analytics = FirebaseAnalytics
    }

}

/*Hola este es un comentario de prueba*/


fun main (){
    print( "hola")


    // Write a message to the database
    //val database = Firebase.database
   // val myRef = database.getReference("message")

   // myRef.setValue("Hello, World!")
}