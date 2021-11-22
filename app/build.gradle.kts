plugins {
    id("com.android.application")
    id("kotlin-android")
    id("android-standard-settings")
}

android {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation (project(":api"))

//    implementation(Libraries.kotlinstdlib)
//    implementation(Libraries.coreKtx)
//    implementation(Libraries.appCompat)
//    implementation(Libraries.materialDesign)
//    implementation(Libraries.constraintLayout)
//    testImplementation(Libraries.junit)
//    androidTestImplementation(Libraries.junitAndroidX)
//    androidTestImplementation(Libraries.espresso)

//    implementation(Libraries.rxAndroid)
//    implementation(Libraries.rxJava)
//    implementation(Libraries.rxKotlin)

    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigationUi)
    implementation(Libraries.fragment)
    implementation(Libraries.viewModelSavedState)

    implementation(Libraries.koin)
    implementation(Libraries.koinScope)
    implementation(Libraries.koinViewModel)

    implementation(Libraries.dimensSdp)

}