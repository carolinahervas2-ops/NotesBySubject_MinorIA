package com.example.notesbysubject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notesbysubject.ui.theme.NotesBySubjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NotesBySubjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SkeletonScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

/**
 * Given by the skeleton, so that the app opens. Replace it with your own screens.
 */
@Composable
fun SkeletonScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.headlineMedium
        )
        Text(text = stringResource(R.string.skeleton_placeholder))
    }
}

@Preview(showBackground = true)
@Composable
fun SkeletonScreenPreview() {
    NotesBySubjectTheme {
        SkeletonScreen()
    }
}
