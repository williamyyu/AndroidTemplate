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
    implementation(Kotlin.stdLib)

    implementation(Material.material)

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appcompat)
    implementation(AndroidX.lifecycleExt)
    implementation(AndroidX.constraintLayout)
    implementation(AndroidX.navigationFragment)
    implementation(AndroidX.navigationUI)
    implementation(AndroidX.roomRuntime)
    kapt(AndroidX.roomCompiler)

    implementation(Hilt.hiltAndroid)
    implementation(Hilt.hiltViewModel)
    kapt(Hilt.hiltCompiler)
    kapt(Hilt.hiltAndroidCompiler)

    implementation(ThirdPartyLib.timber)
    implementation(ThirdPartyLib.mmkv)

    testImplementation(UnitTest.junit4)
    androidTestImplementation(AndroidTest.junit)
    androidTestImplementation(AndroidTest.espressoCore)
}