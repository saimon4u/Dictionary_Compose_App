package com.example.dictionary.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun BarColor(){
    val systemUiController = rememberSystemUiController()
    val color = MaterialTheme.colorScheme.background

    LaunchedEffect(color){
        systemUiController.setSystemBarsColor(color)
    }
}