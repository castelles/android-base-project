package castelles.com.github.api.datasource.model

import castelles.com.github.api.utils.*
import okhttp3.OkHttpClient
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
open class DataSource(private val baseUrl: String = "https://api.github.com/"): KoinComponent {

    private val client: OkHttpClient.Builder by inject()

    protected lateinit var retrofit: Retrofit
    private var token: String? = null

    init {
        build()
    }

    fun setToken(value: String) {
        token = value
    }

    private fun build() {
        client.addInterceptor(AuthInterceptor(token))
        retrofit = Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client.build())
            .build()
    }

    protected fun <T> getResponse(
        response: Response<T>
    ): NetworkFetcher<T> = try {
            if (response.isSuccessful)
                NetworkFetcher.Success(response.body())
            else
                NetworkFetcher.Error(ErrorHandler(response))
        } catch (e: Exception) {
            NetworkFetcher.Error(ErrorHandler(exception = e))
        }

}