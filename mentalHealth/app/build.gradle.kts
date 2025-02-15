plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.mentalhealth"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.mentalhealth"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation ("com.squareup.okhttp3:okhttp:4.12.0")
    implementation 'com.google.android.material:material:1.9.0'
    testImplementation(libs.junit)
    //implementation 'com.android.support:support-compat:25.1.1'

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


}