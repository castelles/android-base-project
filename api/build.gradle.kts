plugins {
    id("com.android.library")
    id("kotlin-android")
    id("android-standard-settings")
}

android {

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

//    implementation(Libraries.kotlinstdlib)
//    implementation(Libraries.coreKtx)
//    implementation(Libraries.appCompat)
//    implementation(Libraries.materialDesign)
//    implementation(Libraries.constraintLayout)
//    testImplementation(Libraries.junit)
//    androidTestImplementation(Libraries.junitAndroidX)
//    androidTestImplementation(Libraries.espresso)

    // API
    implementation(Libraries.retrofit)
    implementation(Libraries.gsonConverter)
    implementation(Libraries.moshiConverter)
    implementation(Libraries.gson)
    implementation(Libraries.loggingInterceptor)
    implementation(Libraries.retrofit)
    implementation(Libraries.okHttp)

//    implementation(Libraries.rxAndroid)
//    implementation(Libraries.rxJava)
//    implementation(Libraries.rxKotlin)
    implementation(Libraries.coroutinesFlow)

}