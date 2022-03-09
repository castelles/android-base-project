package castelles.com.github.gradleconfiguration.libs

object Test: DependencyContainer {
    const val junitVersion = "4.+"
    const val junitAndroidXVersion = "1.1.3"
    const val espressoVersion = "3.4.0"

    const val junit = "junit:junit:$junitVersion"
    const val junitAndroidX = "androidx.test.ext:junit:$junitAndroidXVersion"
    const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"

    override val list: List<String>
        get() = listOf(
            junit,
            junitAndroidX,
            espresso
        )
}