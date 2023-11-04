package com.example.moviles

import android.app.Application
import android.widget.Toast
import com.example.data.AppContainer
import com.example.data.AppDataContainer

class QuestionApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        Toast.makeText(this, "Iniciada base de datos", Toast.LENGTH_LONG).show()
        super.onCreate()
        container = AppDataContainer(this)
    }
}
