plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(AndroidConfigs.compileSdkVersion)
    buildToolsVersion(AndroidConfigs.buildToolsVersion)

    defaultConfig {
        applicationId = AndroidConfigs.applicationId
        versionCode = AndroidConfigs.versionCode
        versionName = AndroidConfigs.versionName

        minSdkVersion(AndroidConfigs.minSdkVersion)
        targetSdkVersion(AndroidConfigs.targetSdkVersion)

        testInstrumentationRunner = "AndroidX.test.runner.AndroidJUnitRunner"

        /**
         * Uncomment the following line if your minSdk is lower than API 21,
         * and use `app:srcCompat` instead of `android:src` for ImageView
         *
         * Vector Drawables is supported from API 21, for the devices that lower than API 21,
         * Gradle will convert these vector drawables into png files which will then increase
         * the app size.
         *
         * So, we can use the AndroidX supportLibrary for the devices that lower than API 21 to support
         * Vector Drawables
         */
        // vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":tmdbsdk"))

    implementation(Libs.Kotlin.stdLib)
    implementation(Libs.Kotlin.coroutinesCore)
    implementation(Libs.Kotlin.coroutinesAndroid)

    implementation(Libs.Material.material)

    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.AndroidX.lifecycleExt)
    implementation(Libs.AndroidX.constraintLayout)
    implementation(Libs.AndroidX.navigationFragment)
    implementation(Libs.AndroidX.navigationUI)
    implementation(Libs.AndroidX.roomRuntime)
    kapt(Libs.AndroidX.roomCompiler)

    implementation(Libs.Hilt.hiltAndroid)
    implementation(Libs.Hilt.hiltViewModel)
    kapt(Libs.Hilt.hiltCompiler)
    kapt(Libs.Hilt.hiltAndroidCompiler)

    implementation(Libs.ThirdPartyLib.timber)
    implementation(Libs.ThirdPartyLib.mmkv)

    testImplementation(TestLibs.UnitTest.junit4)
    androidTestImplementation(TestLibs.AndroidTest.junit)
    androidTestImplementation(TestLibs.AndroidTest.espressoCore)
}