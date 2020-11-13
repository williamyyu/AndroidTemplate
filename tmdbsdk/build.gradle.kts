plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(AndroidConfigs.compileSdkVersion)
    buildToolsVersion(AndroidConfigs.buildToolsVersion)

    defaultConfig {
        versionCode = AndroidConfigs.versionCode
        versionName = AndroidConfigs.versionName

        minSdkVersion(AndroidConfigs.minSdkVersion)
        targetSdkVersion(AndroidConfigs.targetSdkVersion)

        buildConfigField("String", "TMDB_API_KEY", ApiKeys.TMDB_API_KEY)
        buildConfigField("String", "TMDB_BASE_URL", ApiConfigs.TMDB_BASE_URL)
        buildConfigField("String", "TMDB_IMAGE_URL", ApiConfigs.TMDB_IMAGE_URL)

        testInstrumentationRunner = "AndroidX.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
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
    implementation(Libs.Network.Retrofit.retrofit)
    implementation(Libs.Network.Retrofit.moshiConverter)
    implementation(Libs.Network.OkHttp.okHttp)
    implementation(Libs.Network.OkHttp.httpLoggingInterceptor)
    implementation(Libs.Network.Moshi.moshi)
    implementation(Libs.Network.Moshi.moshiKotlin)

    testImplementation(TestLibs.UnitTest.junit4)
    androidTestImplementation(TestLibs.AndroidTest.junit)
    androidTestImplementation(TestLibs.AndroidTest.espressoCore)
}