# AndroidTemplate

## Usage
1. Change `applicationId` in [AndroidConfigs](buildSrc/src/main/java/AndroidConfigs)
2. Change `app_name` in strings.xml
3. Change `rootProject.name` in [settings.gradle.kts](settings.gradle.kts)
4. Rename the package name `com.will.androidtemplate` to whatever you like
5. run `./gradlew dependencyUpdates` to check library version up to date


## Glince
Look at this incredible clear dependencies!

```gradle
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
```
