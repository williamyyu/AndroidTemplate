# AndroidTemplate

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
