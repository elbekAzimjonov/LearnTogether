package com.elbek.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elbek.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                BasicUi(modifier = Modifier.padding(16.dp))
            }
        }
    }
}

@Composable
fun BasicUi(modifier: Modifier = Modifier) {
    val topImage = painterResource(R.drawable.bg_compose_background)
    Column(horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Top) {
        Image(painter = topImage, contentDescription = null)
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            modifier = modifier
                .align(alignment = Alignment.Start)
        )
        Text(
            text = stringResource(R.string.heading),
            modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.description),
            modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)

        )
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        BasicUi(modifier = Modifier.padding(16.dp))
    }
}