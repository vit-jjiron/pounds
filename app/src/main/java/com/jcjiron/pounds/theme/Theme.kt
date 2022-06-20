package com.jcjiron.pounds.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val LightColorPalette = lightColors(
    primary = OrangeF1,
    primaryVariant = OrangeF2,
    onPrimary = Color.White,
    secondary = OrangeF3,
    secondaryVariant = OrangeF4,
    onSecondary = Color.Black,
    error = Red
)

private val DarkColorPalette = darkColors(
    primary = OrangeF1,
    primaryVariant = OrangeF2,
    onPrimary = Color.White,
    secondary = OrangeF1,
    onSecondary = Color.White,
    error = Red
)

@Composable
fun PoundsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
        content = content
    )
}
