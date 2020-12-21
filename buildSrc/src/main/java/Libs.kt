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
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

        // ViewModel
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}"

        // LiveData
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveData}"

        // Annotation processor
        const val lifeCycleCompiler =
            "androidx.lifecycle:lifecycle-compiler:${Versions.lifeCycleCompiler}"

        // Navigation
        const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

        // Room
        const val roomRuntime = "androidx.room:room-ktx:${Versions.room}"
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

    object Network {
        object Retrofit {
            const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
            const val moshiConverter =
                "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}"
        }

        object OkHttp {
            const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
            const val httpLoggingInterceptor =
                "com.squareup.okhttp3:logging-interceptor:${Versions.httpLoggingInterceptor}"
        }

        object Moshi {
            const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
            const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshiKotlin}"
        }
    }

    object ThirdPartyLib {
        // Logging
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

        // key-value storage framework
        const val mmkv = "com.tencent:mmkv-static:${Versions.mmkv}"
    }
}

