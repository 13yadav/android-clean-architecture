package dependencies.dependencies

import dependencies.Versions

object Dependencies {
    val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    val app_compat = "androidx.appcompat:appcompat:${Versions.app_compat}"
    val material_theme = "com.google.android.material:material:${Versions.material_theme}"
    val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation_component}"
    val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation_component}"
}