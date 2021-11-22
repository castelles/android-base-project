package castelles.com.github.gradleconfiguration.libs

object Jetpack: DependencyContainer {

    const val navigationVersion = "2.3.3"
    const val navigationKtxVersion = "2.3.5"
    const val fragmentVersion = "1.3.+"
    const val viewModelSavedStateVersion = "2.3.0"
    const val flowJvmVersion = "1.4.1"

    const val navigationPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:$navigationVersion"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navigationKtxVersion"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:$navigationKtxVersion"
    const val fragment = "androidx.fragment:fragment-ktx:$fragmentVersion"
    const val viewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$viewModelSavedStateVersion"
    const val coroutinesFlow = "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:$flowJvmVersion"

    override val list: List<String>
        get() = listOf(
            navigationFragment,
            navigationUi,
            viewModelSavedState,
            fragment
        )
}