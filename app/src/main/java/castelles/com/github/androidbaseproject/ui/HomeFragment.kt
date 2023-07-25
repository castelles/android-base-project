package castelles.com.github.androidbaseproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import castelles.com.github.androidbaseproject.ui.screen.HomeScreen
import castelles.com.github.androidbaseproject.viewmodel.UserViewModel
import castelles.com.github.api.model.UserResponse
import castelles.com.github.api.utils.ErrorHandler
import castelles.com.github.api.utils.NetworkFetcher
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment: Fragment() {

    private val viewModel: UserViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = ComposeView(requireContext()).apply {
        setContent {
            HomeScreen(viewModel)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViewModel()
    }

    private fun bindViewModel() {
        viewModel.apply {
            userFetcher.onEach { state ->
                when ( val handler = state?.handler) {
                    is NetworkFetcher.Loading -> {}
                    is NetworkFetcher.Success -> doSomethingWithData(handler.result)
                    is NetworkFetcher.Error -> doSomethingWithError(handler.error)
                    else -> {}
                }
            }.launchIn(MainScope())
        }
    }

    private fun doSomethingWithData(result: UserResponse?) {
        // TODO ()
    }

    private fun doSomethingWithError(error: ErrorHandler) {
        // TODO ()
    }

}