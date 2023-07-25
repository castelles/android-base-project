package castelles.com.github.androidbaseproject.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import castelles.com.github.androidbaseproject.viewmodel.UserViewModel
import castelles.com.github.designsystem.component.PrimaryButton
import castelles.com.github.designsystem.preview.StandardPreview

@Composable
fun HomeScreen(
    viewModel: UserViewModel? = null
) {
    var isEnabled by remember { mutableStateOf(true) }

    BoxWithConstraints(
        contentAlignment = Alignment.Center,
    ) {
        PrimaryButton("fetch", isEnabled) {
            isEnabled = false
            Log.e("treasdasda", "asdasdasdasdas")
            viewModel?.getUserInformation()
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    StandardPreview {
        HomeScreen()
    }
}