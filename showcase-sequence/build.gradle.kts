
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
        namespace = "com.joco.showcase.sequence"
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
            
            api(project(":showcaseview"))
            api(project(":dialog"))
        }
        androidMain.dependencies {
            implementation(libs.androidx.core.ktx)
        }
    }
}
