package org.example.project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Assn2",
        alwaysOnTop = true,
    ) {
        App()
    }
}