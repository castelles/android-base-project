package castelles.com.github.gradleconfiguration.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.AppExtension
import org.gradle.api.JavaVersion
import com.android.build.gradle.internal.dsl.ProductFlavor
import castelles.com.github.gradleconfiguration.settings.AndroidSettings
import castelles.com.github.gradleconfiguration.settings.DimensionFlavors
import castelles.com.github.gradleconfiguration.settings.ApplicationVersion
import castelles.com.github.gradleconfiguration.settings.BuildTypes

open class BasicConfigurationPlugin: Plugin<Project> {

    private val proguardFile = "proguard-rules.pro"
    private val kotlinAndroid = "kotlin-android"

    override fun apply(target: Project) {
        target.plugins.apply(kotlinAndroid)

        val extension = target.extensions.getByName("android")
        if (extension is BaseExtension) {
            extension.apply {
                applyAndroidSettings()
                applyProguardSettings()
                enableJava8()
                createFlavours()
            }
        }
    }

    private fun BaseExtension.applyAndroidSettings() {
        compileSdkVersion(AndroidSettings.compileSdkVersion)
        buildToolsVersion(AndroidSettings.buildToolsVersion)
        defaultConfig {
            minSdk = AndroidSettings.minSdkVersion
            targetSdk = AndroidSettings.targetSdkVersion
            versionCode = AndroidSettings.versionCode
            versionName = ApplicationVersion.versionName

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            consumerProguardFile(proguardFile)
        }
        dataBinding.isEnabled = true
//        buildFeatures.compose = true
    }

    private fun BaseExtension.applyProguardSettings() {
        when (this) {
            is LibraryExtension -> defaultConfig {
                consumerProguardFile(proguardFile)
            }
            is AppExtension -> buildTypes {
                getByName(BuildTypes.buildType_release) {
                    isMinifyEnabled = false
                    isShrinkResources = false
                }
            }
        }
    }

    private fun BaseExtension.enableJava8() {
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8

        }
    }

    private fun BaseExtension.createFlavours() {
        flavorDimensions(DimensionFlavors.dimensionEnv)
        productFlavors {
            create(DimensionFlavors.dev) { createDevFlavor() }
        }
    }

    private fun ProductFlavor.createDevFlavor() {
        dimension = DimensionFlavors.dimensionEnv
        versionNameSuffix = DimensionFlavors.devVersionNameSuffix

        resValue(STRING_LOWER, APP_NAME, "${ApplicationVersion.appName}$versionNameSuffix")
        buildConfigField(STRING, BASE_URL, "\"https://api.github.com/\"")
    }

    companion object {
        private const val STRING_LOWER: String = "string"
        private const val STRING: String = "String"
        private const val APP_NAME: String = "app_name"
        private const val BASE_URL = "BASE_URL"
    }

}
