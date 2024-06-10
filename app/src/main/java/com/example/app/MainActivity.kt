package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app.ui.theme.AsdfProtoProducerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AsdfProtoProducerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val user = getMockUser()
    val notific = user.notific
    val extUser = getMockUserExtended()

    Column(modifier = modifier) {
        Text("User", style = MaterialTheme.typography.titleLarge)
        Text("Name: ${user.name}!")
        Text("Email: ${user.email}")
        Spacer(modifier = Modifier.padding(16.dp))
        Text("Notification", style = MaterialTheme.typography.titleLarge)
        Text("Id: ${notific.id}")
        Text("Title: ${notific.title}")
        Text("Body: ${notific.body}")
        Spacer(modifier = Modifier.padding(16.dp))
        Text("User Extended", style = MaterialTheme.typography.titleLarge)
        Text("Id: ${extUser.userId}")
        Text("Age: ${extUser.age}")
        Text("Height: ${extUser.height}")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AsdfProtoProducerTheme {
        Greeting()
    }
}