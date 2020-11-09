/**
 * @author WeiYi Yu
 * @date 2020-11-04
 */

object Libs {
    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        const val coroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val lifecycleExt = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExt}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

        // Navigation
        const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

        // Room
        const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    }

    object Material {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object Hilt {
        const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hilt}"
        const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hilt}"
        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hiltAndroid}"
        const val hiltAndroidCompiler =
            "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroid}"
    }

    object ThirdPartyLib {
        // Logging
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

        // key-value storage framework
        const val mmkv = "com.tencent:mmkv-static:${Versions.mmkv}"
    }
}

