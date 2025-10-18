package com.iqballmln0143.masak2.ui.screen.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.firebase.auth.FirebaseUser
import com.iqballmln0143.masak2.R
import com.iqballmln0143.gabung.ui.TopAppBarWithLogout
import com.iqballmln0143.gabung.ui.UserProfileCard

@Composable
fun MainScreen(
    user: FirebaseUser
){
    Scaffold (
        topBar = { TopAppBarWithLogout(R.string.app_name)}
    ){ innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ){
            UserProfileCard(user)
        }
    }
}