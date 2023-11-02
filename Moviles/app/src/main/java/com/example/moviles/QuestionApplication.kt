package com.example.moviles

import android.app.Application
import com.example.data.AppContainer
import com.example.data.AppDataContainer

class QuestionApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}