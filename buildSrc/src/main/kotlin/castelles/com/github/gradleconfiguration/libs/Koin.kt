package castelles.com.github.gradleconfiguration.libs

object Koin: DependencyContainer {

    const val koinVersion = "2.2.0"
    const val koin = "org.koin:koin-android:$koinVersion"
    const val koinScope = "org.koin:koin-android-scope:$koinVersion"
    const val koinViewModel= "org.koin:koin-android-viewmodel:$koinVersion"

    override val list: List<String>
        get() = listOf(
            koin,
            koinScope,
            koinViewModel
        )
}