@file:Suppress("unused")

package coil

object Library {

    // CORE

    private const val COROUTINES_VERSION = "1.2.2"
    const val KOTLINX_COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$COROUTINES_VERSION"

    const val ANDROIDX_ANNOTATION = "androidx.annotation:annotation:1.1.0"
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:1.0.2"
    const val ANDROIDX_COLLECTION = "androidx.collection:collection-ktx:1.1.0"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val ANDROIDX_CORE = "androidx.core:core-ktx:1.0.2"
    const val ANDROIDX_EXIF_INTERFACE = "androidx.exifinterface:exifinterface:1.0.0"
    const val ANDROIDX_MULTIDEX = "androidx.multidex:multidex:2.0.1"
    const val ANDROIDX_RECYCLER_VIEW = "androidx.recyclerview:recyclerview:1.0.0"

    private const val LIFECYCLE_VERSION = "2.0.0"
    const val ANDROIDX_LIFECYCLE_COMMON = "androidx.lifecycle:lifecycle-common-java8:$LIFECYCLE_VERSION"
    const val ANDROIDX_LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_VERSION"
    const val ANDROIDX_LIFECYCLE_LIVE_DATA = "androidx.lifecycle:lifecycle-livedata:$LIFECYCLE_VERSION"
    const val ANDROIDX_LIFECYCLE_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"

    const val MATERIAL = "com.google.android.material:material:1.0.0"

    private const val OKHTTP_VERSION = "3.12.3"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:$OKHTTP_VERSION"

    const val OKIO = "com.squareup.okio:okio:2.3.0"

    // TEST

    const val KOTLINX_COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$COROUTINES_VERSION"

    const val ANDROIDX_TEST_CORE = "androidx.test:core-ktx:1.2.0"
    const val ANDROIDX_TEST_JUNIT = "androidx.test.ext:junit-ktx:1.1.1"
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:1.2.0"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:1.2.0"

    const val OKHTTP_MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:$OKHTTP_VERSION"

    const val ROBOLECTRIC = "org.robolectric:robolectric:4.3"
}
