package com.iqballmln0143.user.ui.app

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.iqballmln0143.user.R
import com.iqballmln0143.user.ui.main.MainScreen
import com.iqballmln0143.gabung.ui.WelcomeScreen

@Composable
fun UserApp(){
    val viewModel: AppViewModel = viewModel()
    val userFlow by viewModel.userFlow.collectAsState()

    if (userFlow == null){
        Scaffold { innerPadding ->
            WelcomeScreen(
                appLogo = R.mipmap.ic_launcher,
                appName = R.string.app_name,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
    userFlow?.let { MainScreen(it) }
}