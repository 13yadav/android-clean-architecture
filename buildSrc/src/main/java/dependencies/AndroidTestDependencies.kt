package dependencies.dependencies

import dependencies.Versions

object AndroidTestDependencies {
    val instrumentation_runner = "androidx.test.runner.AndroidJUnitRunner"

    val test_junit = "androidx.test.ext:junit:${Versions.test_junit}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}