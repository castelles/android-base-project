import Build_gradle.InternalDep.buildGradle
import Build_gradle.InternalDep.kotlinGradle
import Build_gradle.InternalDep.navigationPlugin

object InternalDep {
    const val buildGradleVersion = "4.2.1"
    const val kotlinVersion = "1.5.10"
    const val navigationVersion = "2.3.3"

    const val buildGradle = "com.android.tools.build:gradle:$buildGradleVersion"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val navigationPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:$navigationVersion"

    const val quadrant_gradle_plugin = "gradle.plugin.com.gaelmarhic:quadrant:1.5"
}

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        register("android-standard-settings") {
            id = "android-standard-settings"
            implementationClass = "castelles.com.github.gradleconfiguration.plugins.StandardSettingsPlugin"
        }
    }
}

repositories {
    google()
    mavenCentral()
    maven(url = "https://plugins.gradle.org/m2/")
}

dependencies {
    compileOnly(gradleApi())

    implementation(buildGradle)
    implementation(kotlinGradle)
    implementation(navigationPlugin)
    implementation(InternalDep.quadrant_gradle_plugin)
}