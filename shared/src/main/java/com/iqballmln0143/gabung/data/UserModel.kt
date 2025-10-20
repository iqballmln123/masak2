package com.iqballmln0143.gabung.data

data class UserModel(
    val uid: String = "",
    val email: String = "",
    val displayName: String = "",
    val photoUrl: String = "",
    val role: String = "" // "admin" atau "user"
)