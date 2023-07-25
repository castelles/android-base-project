package castelles.com.github.designsystem.preview

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun StandardPreview(content: @Composable () -> Unit) {
    MaterialTheme(content = content)
}
