package castelles.com.github.gradleconfiguration.libs

object Utils: DependencyContainer {

    const val dimesLayoutVersion = "1.0.5"
    const val dimensSdp = "com.intuit.sdp:sdp-android:$dimesLayoutVersion"

    const val lottieVersion = "4.2.0"
    const val lottie = "com.airbnb.android:lottie:$lottieVersion"


    override val list: List<String>
        get() = listOf(
            dimensSdp,
            lottie
        )
}