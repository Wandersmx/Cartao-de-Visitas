package com.example.businesscardapp.data

import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

class BusinessCardRepository (private val dao: BusinessCardDao){

    fun insert(businessCard: BusinessCard) = runBlocking {
       launch(Dispatchers.IO) {
           dao.insert(businessCard)
       }
    }

    fun getAll() = dao.getAll()
}