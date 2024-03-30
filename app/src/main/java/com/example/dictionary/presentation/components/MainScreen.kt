package com.example.dictionary.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.dictionary.presentation.MainState

@Composable
fun MainScreen(
    mainState: MainState,
    modifier: Modifier
){
    Box(
        modifier = modifier
    ){
        WordPreview(
            mainState = mainState
        )
        Box(
            modifier = Modifier
                .padding(top = 110.dp)
                .fillMaxSize()
                .clip(
                    RoundedCornerShape(
                        topStart = 50.dp,
                        topEnd = 50.dp
                    )
                )
                .background(MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.7f))
        ){
            if(mainState.isLoading){
                CircularProgressIndicator(
                    modifier = Modifier
                        .size(80.dp)
                        .align(Alignment.Center),
                    color = MaterialTheme.colorScheme.primary
                )
            }
            else{
                mainState.wordItem?.let{wordItem ->
                    WordDetails(
                        wordItem = wordItem
                    )
                }
            }
        }
    }
}