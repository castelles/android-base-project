package castelles.com.github.gradleconfiguration.libs

object Rx: DependencyContainer {

    private const val rxJavaVersion = "2.2.9"
    private const val rxKotlinVersion = "2.1.0"

    const val rxJava = "io.reactivex.rxjava2:rxjava:$rxJavaVersion"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:$rxKotlinVersion"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:$rxKotlinVersion"

    override val list: List<String>
        get() = listOf(
            rxJava,
            rxKotlin,
            rxAndroid
        )
}