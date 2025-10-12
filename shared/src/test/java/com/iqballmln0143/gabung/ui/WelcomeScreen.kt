package com.iqballmln0143.gabung.ui

import android.R.attr.id
import android.graphics.drawable.AdaptiveIconDrawable
import android.media.tv.TvContract
import android.os.Build
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.toBitmap

@Composable
private fun adaptiveIconPainterResource(@DrawableRes id: Int): Painter {
    val res = LocalContext.current.resources
    val theme = LocalContext.current.theme

    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
        val adaptiveIcon = ResourcesCompat.getDrawable(res, id, theme)
        as? AdaptiveIconDrawable
        if ( adaptiveIcon !=null){
            BitmapPainter(adaptiveIcon.toBitmap().asImageBitmap())
        }else{
            painterResource(id)
        }
    }else{
        painterResource(id)
        }
    }
@Composable
private fun WelcomeScreen(
    @DrawableRes appLogo: Int,
    @StringRes appName: Int,
    modifier: Modifier = Modifier
){
    Column  (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Image(
            modifier = Modifier
                .fillMaxSize(0.5f)
                .padding(bottom = 32.dp)
                .aspectRatio(1f)
                .clip(CircleShape),
            painter = adaptiveIconPainterResource(appLogo),
            contentDescription = stringResource(appName)
        )
        Text(
            text = stringResource(appName),
            fontSize = 32.sp
        )
    }
}
