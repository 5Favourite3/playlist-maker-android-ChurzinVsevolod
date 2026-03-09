package ru.yandex.practicum.playlistmaker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import ru.yandex.practicum.playlistmaker.R

@Composable
fun PlaylistMakerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val ypBlue = colorResource(id = R.color.yp_blue)
    val ypBlack = colorResource(id = R.color.yp_black)
    val ypWhite = colorResource(id = R.color.yp_white)
    val ypTextGray = colorResource(id = R.color.yp_text_gray)
    val ypLightGray = colorResource(id = R.color.yp_light_gray)

    val colorScheme = if (darkTheme) {
        darkColorScheme(
            primary = ypBlue,
            secondary = ypTextGray,
            tertiary = ypLightGray,
            background = ypBlack,
            surface = ypBlack,
            onPrimary = ypWhite,
            onBackground = ypWhite,
            onSurface = ypWhite
        )
    } else {
        lightColorScheme(
            primary = ypBlue,
            secondary = ypTextGray,
            tertiary = ypLightGray,
            background = ypWhite,
            surface = ypWhite,
            onPrimary = ypWhite,
            onBackground = ypBlack,
            onSurface = ypBlack
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
