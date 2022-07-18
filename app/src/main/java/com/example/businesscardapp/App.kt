package com.example.businesscardapp

import android.app.Application
import com.example.businesscardapp.data.AppDatabase
import com.example.businesscardapp.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}