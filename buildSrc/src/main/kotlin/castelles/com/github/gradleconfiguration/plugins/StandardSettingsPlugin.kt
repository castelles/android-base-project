package castelles.com.github.gradleconfiguration.plugins

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import castelles.com.github.gradleconfiguration.extensions.implementationAll
import castelles.com.github.gradleconfiguration.libs.*

class StandardSettingsPlugin: BaseAndroidPlugin() {

    override fun apply(target: Project) {
        super.apply(target)
        applyStandardDependencies(target)
    }

    private fun applyStandardDependencies(project: Project) {
        project.dependencies {
            implementationAll(Kotlin.list)
            implementationAll(Android.list)
            implementationAll(Rx.list)
            implementationAll(Test.list)
        }
    }

}