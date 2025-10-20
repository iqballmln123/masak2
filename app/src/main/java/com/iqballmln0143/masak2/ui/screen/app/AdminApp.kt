//package com.iqballmln0143.masak2.ui.screen.app
//
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.collectAsState
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Modifier
//import androidx.lifecycle.viewmodel.compose.viewModel
//import com.iqballmln0143.gabung.ui.WelcomeScreen
//import com.iqballmln0143.masak2.R
//import com.iqballmln0143.masak2.ui.screen.main.MainScreen
//
//@Composable
//fun AdminApp(){
//    val viewModel: AppViewModel = viewModel()
//    val userFlow by viewModel.userFlow.collectAsState()
//
//    if (userFlow == null){
//        Scaffold { innerPadding ->
//            WelcomeScreen(
//                appLogo = R.mipmap.ic_launcher,
//                appName = R.string.app_name,
//                modifier = Modifier.padding(innerPadding)
//            )
//        }
//    }
//    userFlow?.let { MainScreen(it) }
//}

package com.iqballmln0143.masak2.ui.screen.app

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.iqballmln0143.masak2.R
import com.iqballmln0143.masak2.ui.screen.main.MainScreen
import com.iqballmln0143.gabung.ui.WelcomeScreen

@Composable
fun AdminApp(){
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