import castelles.com.github.gradleconfiguration.extensions.implementationAll
import castelles.com.github.gradleconfiguration.libs.Network
import castelles.com.github.gradleconfiguration.libs.Jetpack
import castelles.com.github.gradleconfiguration.libs.Koin

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("android-standard-settings")
}

android {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementationAll(Network.list)
    implementationAll(Jetpack.list)
    implementationAll(Koin.list)
}