package io.termplux.ui.layout

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.fragment.app.FragmentContainerView
import io.termplux.ui.preview.ScreenPreviews
import io.termplux.ui.theme.TermPluxAppTheme
import io.termplux.ui.widget.Content

@Composable
fun ScreenHome(
    container: FragmentContainerView
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        OutlinedCard(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    vertical = 8.dp,
                    horizontal = 12.dp
                )
        ) {
            Content(
                container = container,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Composable
@ScreenPreviews
fun ScreenHomePreview() {
    TermPluxAppTheme {
        ScreenHome(
            container = FragmentContainerView(LocalContext.current),
        )
    }
}