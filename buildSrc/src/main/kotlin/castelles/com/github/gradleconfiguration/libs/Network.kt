package castelles.com.github.gradleconfiguration.libs

object Network: DependencyContainer {

    const val gsonVersion = "2.8.6"
    const val loggingVersion = "4.7.2"
    const val okhttpVersion = "2.7.2"
    const val retrofitVersion = "2.9.0"

    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"
    //    const val scalarsConverter = "com.squareup.retrofit2:converter-scalars:${Versions}"
    const val gson = "com.google.code.gson:gson:$gsonVersion"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$loggingVersion"
    const val okHttp = "com.squareup.okhttp3:okhttp:$okhttpVersion"

    override val list: List<String>
        get() = listOf(
            retrofit,
            gsonConverter,
            moshiConverter,
            gson,
            loggingInterceptor,
            okHttp
        )

}