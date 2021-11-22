package castelles.com.github.gradleconfiguration.extensions

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementationAll(dependencyList: List<Any>): List<Dependency?> =
    dependencyList.map { add("implementation", it) }