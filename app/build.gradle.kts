plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KSP)
    id(Plugins.SECRETS_GRADLE_PLUGIN)
    id(Plugins.SAFEARGS)
    id(Plugins.PARCELIZE)
    id(Plugins.HILT_PLUGIN)
}

android {
    namespace = "com.hmj3908.booksearchapp"
    compileSdk = DefaultConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.hmj3908.booksearchapp"
        minSdk = DefaultConfig.MIN_SDK_VERSION
        targetSdk = DefaultConfig.TARGET_SDK_VERSION
        versionCode = DefaultConfig.VERSION_CODE
        versionName = DefaultConfig.VERSION_NAME

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }
    // kapt 설정
//    ksp {
//        correctErrorTypes = true
//    }
}

dependencies {

    implementation(Dependencies.CORE_KTX)
    implementation(Dependencies.APP_COMPAT)
    implementation(Dependencies.MATERIAL)
    implementation(Dependencies.CONSTRAINT_LAYOUT)
    testImplementation(Testing.JUNIT4)
    androidTestImplementation(Testing.ANDROID_JUNIT)
    androidTestImplementation(Testing.ESPRESSO_CORE)

    // Retrofit
    implementation(Dependencies.RETROFIT)
    implementation(Dependencies.RETROFIT_CONVERTER_MOSHI)

    // Moshi
    implementation(Dependencies.MOSHI)
    ksp(Dependencies.MOSHI_KSP)

    // Okhttp
    implementation(Dependencies.OKHTTP)
    implementation(Dependencies.OKHTTP_LOGGING_INTERCEPTOR)

    // Lifecycle
    implementation(Dependencies.LIFECYCLE_VIEWMODEL_KTX)
    implementation(Dependencies.LIFECYCLE_RUNTIME_KTX)
    implementation(Dependencies.LIFECYCLE_SAVEDSTATE)

    // Coroutine
    implementation(Dependencies.COROUTINE_CORE)
    implementation(Dependencies.COROUTINE_ANDROID)

    // Coil
    implementation(Dependencies.COIL)

    // Recyclerview
    implementation(Dependencies.RECYCLERVIEW)

    // Navigation
    implementation(Dependencies.NAVIGATION_FRAGMENT_KTX)
    implementation(Dependencies.NAVIGATION_UI_KTX)

    // Room 2.6.1은 오류발생 다운그레이드 필요
    implementation(Dependencies.ROOM_RUNTIME)
    implementation(Dependencies.ROOM_KTX)
    ksp(Dependencies.ROOM_KSP)
    implementation(Dependencies.ROOM_PAGING)

    // Kotlin serialization
    implementation(Dependencies.KOTLIN_SERIALIZATION)

    // DataStore
    implementation(Dependencies.PREFERENCES_DATASTORE)

    // Paging
    implementation(Dependencies.PAGING)

    // WorkManager compileSdk 31이상
    implementation(Dependencies.WORKMANAGER)

    // Hilt
    implementation(Dependencies.DAGGER_HILT)
    ksp(Dependencies.DAGGER_HILT_KSP)
    
    // Hilt extension
    implementation(Dependencies.HILT_EXTENSION_WORK)
    ksp(Dependencies.HILT_EXTENSION_KSP)

    // ViewModel delegate
    implementation(Dependencies.ACTIVITY_KTX)
    implementation(Dependencies.FRAGMENT_KTX)
}