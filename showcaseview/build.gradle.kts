
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidKotlinMultiplatformLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    id("maven-publish")
}

group = "io.github.shafayathossain"
version = "1.4.0-beta01"



kotlin {
    androidLibrary {
        namespace = "com.joco.showcaseview"
        compileSdk = 36
        minSdk = 23
    }
    
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    
    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.material3)
            implementation(libs.compose.ui)
            implementation(libs.compose.components.resources)
        }
        androidMain.dependencies {
            implementation(libs.androidx.core.ktx)
        }
        iosMain.dependencies {
        }
    }
}
