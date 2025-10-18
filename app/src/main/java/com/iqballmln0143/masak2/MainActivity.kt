package com.iqballmln0143.masak2

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
import com.iqballmln0143.gabung.ui.WelcomeScreen
import com.iqballmln0143.masak2.ui.theme.Masak2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Masak2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    WelcomeScreen(
                        appLogo = R.mipmap.ic_launcher,
                        appName = R.string.app_name,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AdminAppPreview() {
    Masak2Theme {
        WelcomeScreen(
            appLogo = R.mipmap.ic_launcher,
            appName = R.string.app_name
        )
    }
}