package castelles.com.github.gradleconfiguration.libs

object Android: DependencyContainer {

    const val coreKtxVersion = "1.6.0"
    const val appcompatVersion = "1.3.1"
    const val materialVersion = "1.4.0"
    const val constraintLayoutVersion = "2.0.4"

    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
    const val appCompat = "androidx.appcompat:appcompat:$appcompatVersion"
    const val materialDesign = "com.google.android.material:material:$materialVersion"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"

    override val list: List<String>
        get() = listOf(
            coreKtx,
            appCompat,
            materialDesign,
            constraintLayout
        )
}