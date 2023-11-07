package com.example.modul_10retrofit.network

import com.example.modul_10retrofit.model.Users
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("employees")
    fun getAllUsers(): Call<Users>

}