package com.example.dictionary.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dictionary.presentation.MainState
import com.example.dictionary.presentation.MainUiEvents
import com.example.dictionary.presentation.MainViewModel

@Composable
fun TopBar(
    mainState: MainState,
    mainViewModel: MainViewModel
){
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        value = mainState.searchWord,
        onValueChange = {
            mainViewModel.onEvent(MainUiEvents.OnSearchWordChange(it))
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Rounded.Search,
                contentDescription = "Search a word",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .size(30.dp)
                    .clickable {
                        mainViewModel.onEvent(
                            MainUiEvents.OnSearchClick
                        )
                    }
            )
        },
        label = {
            Text(
                text = "Search a word",
                fontSize = 15.sp,
                modifier = Modifier.alpha(0.7f)
            )
        },
        textStyle = TextStyle(
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 19.5.sp
        )
    )
}