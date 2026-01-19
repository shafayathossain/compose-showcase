
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidKotlinMultiplatformLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    id("maven-publish")
}

group = "io.github.jocoand"
version = "1.0.0"



kotlin {
    androidLibrary {
        namespace = "com.joco.dialog"
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
        }
        androidMain.dependencies {
            implementation(libs.androidx.core.ktx)
        }
    }
}
