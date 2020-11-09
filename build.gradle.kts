// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(GradleLibs.gradle)
        classpath(GradleLibs.kotlin)
        classpath(GradleLibs.saveArgs)
        classpath(GradleLibs.hiltAndroid)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}