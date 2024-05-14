package com.example.sample01.Scene

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sample01.ui.theme.Sample01Theme


@Composable
fun StartScene() {
    Text(
        text = "Hello!",
    )
}

@Preview(showBackground = true)
@Composable
fun StartPreview() {
    Sample01Theme {
        StartScene()
    }
}