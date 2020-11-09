# AndroidTemplate

## Usage
1. Change `applicationId` in [AndroidConfigs](buildSrc/src/main/java/AndroidConfigs)
2. Change `app_name` in strings.xml
3. Change `rootProject.name` in [settings.gradle.kts](settings.gradle.kts)
4. Rename the package name `com.will.androidtemplate` to whatever you like

## How To Enable Dependency Version Checker
Download the [customlintversioncheck.jar](customlintversioncheck.jar) and put it under path `~/.android/lint`.

> Note: I'm using a customize version of the [version-checker-gradle-lint](https://github.com/PicPay/version-checker-gradle-lint), 
which makes dependencies can be nested in one file. For instance, `Libs.Kotlin.stdLib`. If you'd prefer to create serveral separate files for dependencies, feel free to download the original jar from [version-checker-gradle-lint](https://github.com/PicPay/version-checker-gradle-lint).

## Glance
Look at this incredible clear dependencies!

```gradle
dependencies {
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
```
