package com.iqballmln0143.user

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.iqballmln0143.user.ui.app.UserApp
import com.iqballmln0143.user.ui.theme.Masak2Theme
import com.iqballmln0143.gabung.ui.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Masak2Theme {
                UserApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MahasiswaAppPreview() {
    Masak2Theme {
        WelcomeScreen(
            appLogo = R.mipmap.ic_launcher,
            appName = R.string.app_name
        )
    }
}