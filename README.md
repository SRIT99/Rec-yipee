**hello** this is a recipie searching app!! open source project you can reuse the code freely if you want but make sure to give proper credits of my github **https://github.com/SRIT99/Rec-yipee.git**.
Used Api from: **themealdb.com**. 
used dependencies: 
**build.graddle.kts(app level)**
<code>
plugins {
 id("com.google.devtools.ksp")
  id("com.google.dagger.hilt.android")
}
android {
  ...
}
dependencies {
// dragger hilt with ksp
  implementation("com.google.dagger:hilt-android:2.51.1")
  ksp("com.google.dagger:hilt-android-compiler:2.51.1")
  //
   implementation(libs.androidx.hilt.navigation.fragment)
    //testing
    testImplementation(libs.androidx.annotation)
    testImplementation(libs.androidx.junit.ktx)
    implementation(libs.androidx.junit)
// Required -- JUnit 4 framework
    testImplementation(libs.junit)
    // Optional -- Robolectric environment
    testImplementation (libs.androidx.core)
    // Optional -- Mockito framework
    testImplementation (libs.mockito.core)
    // Optional -- mockito-kotlin
    testImplementation (libs.mockito.kotlin)
    // Optional -- Mockk framework
    testImplementation (libs.mockk)
    androidTestImplementation (libs.mockk.android)
    //lifecycle
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    // ViewModel utilities for Compose
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx)
    // Lifecycle utilities for Compose
    implementation(libs.androidx.lifecycle.runtime.compose)
    // Saved state module for ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.savedstate)
//Room
    implementation(libs.androidx.room.runtime)
    ksp(libs.androidx.room.compiler)
    implementation(libs.androidx.room.ktx)
//networking
    // Retrofit
    implementation (libs.retrofit)
// GSON Converter
    implementation (libs.converter.gson)
// Kotlin Coroutines
    implementation (libs.kotlinx.coroutines.android)
    implementation (libs.kotlinx.coroutines.core)
    //serialization
    implementation(libs.androidx.navigation.compose)
    implementation(libs.kotlinx.serialization.json)
//expo player with media
    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.ui)
    implementation(libs.androidx.media3.common)
    //youtube video player
    implementation(libs.core) 
}
</code>

**libs.toml file**

<code> 
[versions]
agp = "8.7.3"
annotation = "1.9.1"
converterGson = "2.9.0"
core = "1.15.0"
coreVersion = "12.1.1"
hiltAndroid = "2.55"
hiltNavigationFragment = "1.2.0"
junitKtx = "1.5.0"
kotlin = "2.1.10"
coreKtx = "1.15.0"
junit = "4.13.2"
junitVersion = "1.2.1"
espressoCore = "3.6.1"
kotlinxCoroutinesAndroid = "1.10.1"
kotlinxCoroutinesCore = "1.10.1"
kotlinxSerializationJson = "1.8.0"
lifecycleRuntimeKtx = "2.8.7"
activityCompose = "1.10.1"
composeBom = "2025.02.00"
appcompat = "1.7.0"
material = "1.12.0"
media3Exoplayer = "1.5.1"
mockitoCore = "2.24.5"
mockitoKotlin = "2.24.5"
mockk = "1.13.17"
mockkAndroid = "1.13.7"
navigationCompose = "2.8.8"
retrofit = "2.9.0"
roomCompiler = "2.6.1"

[libraries]
androidx-annotation = { module = "androidx.annotation:annotation", version.ref = "annotation" }
androidx-core = { module = "androidx.test:core", version.ref = "core" }
androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "coreKtx" }
androidx-hilt-navigation-fragment = { module = "androidx.hilt:hilt-navigation-fragment", version.ref = "hiltNavigationFragment" }
androidx-junit-ktx = { module = "androidx.text.ext:junit-ktx", version.ref = "junitKtx" }
androidx-lifecycle-livedata-ktx = { module = "androidx.lifecycle:lifecycle-livedata-ktx", version.ref = "lifecycleRuntimeKtx" }
androidx-lifecycle-runtime-compose = { module = "androidx.lifecycle:lifecycle-runtime-compose", version.ref = "lifecycleRuntimeKtx" }
androidx-lifecycle-viewmodel-compose = { module = "androidx.lifecycle:lifecycle-viewmodel-compose", version.ref = "lifecycleRuntimeKtx" }
androidx-lifecycle-viewmodel-ktx = { module = "androidx.lifecycle:lifecycle-viewmodel-ktx", version.ref = "lifecycleRuntimeKtx" }
androidx-lifecycle-viewmodel-savedstate = { module = "androidx.lifecycle:lifecycle-viewmodel-savedstate", version.ref = "lifecycleRuntimeKtx" }
androidx-media3-common = { module = "androidx.media3:media3-common", version.ref = "media3Exoplayer" }
androidx-media3-exoplayer = { module = "androidx.media3:media3-exoplayer", version.ref = "media3Exoplayer" }
androidx-media3-ui = { module = "androidx.media3:media3-ui", version.ref = "media3Exoplayer" }
androidx-navigation-compose = { module = "androidx.navigation:navigation-compose", version.ref = "navigationCompose" }
androidx-room-compiler = { module = "androidx.room:room-compiler", version.ref = "roomCompiler" }
androidx-room-ktx = { module = "androidx.room:room-ktx", version.ref = "roomCompiler" }
androidx-room-runtime = { module = "androidx.room:room-runtime", version.ref = "roomCompiler" }
converter-gson = { module = "com.squareup.retrofit2:converter-gson", version.ref = "converterGson" }
core = { module = "com.pierfrancescosoffritti.androidyoutubeplayer:core", version.ref = "coreVersion" }
hilt-android = { module = "com.google.dagger:hilt-android", version.ref = "hiltAndroid" }
hilt-android-compiler = { module = "com.google.dagger:hilt-android-compiler", version.ref = "hiltAndroid" }
junit = { group = "junit", name = "junit", version.ref = "junit" }
androidx-junit = { group = "androidx.test.ext", name = "junit", version.ref = "junitVersion" }
androidx-espresso-core = { group = "androidx.test.espresso", name = "espresso-core", version.ref = "espressoCore" }
androidx-lifecycle-runtime-ktx = { group = "androidx.lifecycle", name = "lifecycle-runtime-ktx", version.ref = "lifecycleRuntimeKtx" }
androidx-activity-compose = { group = "androidx.activity", name = "activity-compose", version.ref = "activityCompose" }
androidx-compose-bom = { group = "androidx.compose", name = "compose-bom", version.ref = "composeBom" }
androidx-ui = { group = "androidx.compose.ui", name = "ui" }
androidx-ui-graphics = { group = "androidx.compose.ui", name = "ui-graphics" }
androidx-ui-tooling = { group = "androidx.compose.ui", name = "ui-tooling" }
androidx-ui-tooling-preview = { group = "androidx.compose.ui", name = "ui-tooling-preview" }
androidx-ui-test-manifest = { group = "androidx.compose.ui", name = "ui-test-manifest" }
androidx-ui-test-junit4 = { group = "androidx.compose.ui", name = "ui-test-junit4" }
androidx-material3 = { group = "androidx.compose.material3", name = "material3" }
androidx-appcompat = { group = "androidx.appcompat", name = "appcompat", version.ref = "appcompat" }
kotlinx-coroutines-android = { module = "org.jetbrains.kotlinx:kotlinx-coroutines-android", version.ref = "kotlinxCoroutinesAndroid" }
kotlinx-coroutines-core = { module = "org.jetbrains.kotlinx:kotlinx-coroutines-core", version.ref = "kotlinxCoroutinesCore" }
kotlinx-serialization-json = { module = "org.jetbrains.kotlinx:kotlinx-serialization-json", version.ref = "kotlinxSerializationJson" }
material = { group = "com.google.android.material", name = "material", version.ref = "material" }
mockito-core = { module = "org.mockito:mockito-core", version.ref = "mockitoCore" }
mockito-kotlin = { module = "org.mockito.kotlin:mockito-kotlin", version.ref = "mockitoKotlin" }
mockk = { module = "io.mockk:mockk", version.ref = "mockk" }
mockk-android = { module = "io.mockk:mockk-android", version.ref = "mockkAndroid" }
retrofit = { module = "com.squareup.retrofit2:retrofit", version.ref = "retrofit" }

[plugins]
android-application = { id = "com.android.application", version.ref = "agp" }
kotlin-android = { id = "org.jetbrains.kotlin.android", version.ref = "kotlin" }
kotlin-compose = { id = "org.jetbrains.kotlin.plugin.compose", version.ref = "kotlin" }
android-library = { id = "com.android.library", version.ref = "agp" }
</code>
