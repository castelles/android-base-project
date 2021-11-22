package castelles.com.github.gradleconfiguration.libs

object Kotlin: DependencyContainer {

    const val buildGradleVersion = "4.2.1"
    const val kotlinVersion = "1.5.10"

    const val buildGradle = "com.android.tools.build:gradle:$buildGradleVersion"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val kotlinstdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"

    override val list: List<String>
        get() = listOf(kotlinstdlib)

}