object Dependencies {
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"

    // Retrofit
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTER_MOSHI =
        "com.squareup.retrofit2:converter-moshi:${Versions.RETROFIT}"

    // Moshi
    const val MOSHI = "com.squareup.moshi:moshi:${Versions.MOSHI}"
    const val MOSHI_KSP = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.MOSHI}"

    // Okhttp
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val OKHTTP_LOGGING_INTERCEPTOR =
        "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"

    // Lifecycle
    const val LIFECYCLE_VIEWMODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_RUNTIME_KTX =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_SAVEDSTATE =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.LIFECYCLE}"

    // Coroutine
    const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
    const val COROUTINE_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"

    // Coil
    const val COIL = "io.coil-kt:coil:${Versions.COIL}"

    // Recyclerview
    const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEW}"

    // Navigation
    const val NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"

    // Room 2.6.1은 오류발생 다운그레이드 필요
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    const val ROOM_KSP = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ROOM_PAGING = "androidx.room:room-paging:${Versions.ROOM_PAGING}"

    // Kotlin serialization
    const val KOTLIN_SERIALIZATION =
        "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.KOTLIN_SERIALIZATION}"

    // DataStore
    const val PREFERENCES_DATASTORE =
        "androidx.datastore:datastore-preferences:${Versions.DATASTORE}"

    // Paging
    const val PAGING = "androidx.paging:paging-runtime-ktx:${Versions.PAGING}"

    // WorkManager compileSdk 31이상
    const val WORKMANAGER = "androidx.work:work-runtime-ktx:${Versions.WORKMANAGER}"

    // Hilt
    const val DAGGER_HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val DAGGER_HILT_KSP = "com.google.dagger:hilt-compiler:${Versions.HILT}"

    // Hilt extension
    const val HILT_EXTENSION_WORK = "androidx.hilt:hilt-work:${Versions.HILT_EXTENSION}"
    const val HILT_EXTENSION_KSP = "androidx.hilt:hilt-compiler:${Versions.HILT_EXTENSION}"

    // ViewModel delegate
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"
}