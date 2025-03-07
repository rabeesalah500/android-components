/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// If you ever need to force a toolchain rebuild (taskcluster) then edit the following comment.
// FORCE REBUILD 2022-09-30

// Synchronized version numbers for dependencies used by (some) modules
object Versions {
    const val kotlin = "1.6.10"
    const val coroutines = "1.6.1"

    const val junit = "4.13.2"
    const val robolectric = "4.9"
    const val mockito = "3.12.4"
    const val maven_ant_tasks = "2.1.3"

    // TO-DO: These could be kept in sync in the future
    const val mockwebserver = "3.10.0"
    const val okhttp = "3.13.1"

    const val android_gradle_plugin = "7.3.0"

    // This has to be synced to the gradlew plugin version. See
    // http://googlesamples.github.io/android-custom-lint-rules/api-guide/example.md.html#example:samplelintcheckgithubproject/lintversion?
    const val lint = "30.3.0"
    const val detekt = "1.19.0"

    const val sentry_legacy = "1.7.30"
    const val sentry_latest = "6.4.2"
    const val zxing = "3.5.0"
    const val jna = "5.12.1"
    const val disklrucache = "2.0.2"
    const val leakcanary = "2.9.1"

    const val mozilla_appservices = "94.2.1"

    // DO NOT MODIFY MANUALLY. This is auto-updated along with GeckoView.
    const val mozilla_glean = "51.4.0"

    const val material = "1.2.1"

    // see https://android-developers.googleblog.com/2022/06/independent-versioning-of-Jetpack-Compose-libraries.html
    // for Jetpack Compose libraries versioning
    const val compose_version = "1.2.1"
    const val compose_compiler = "1.1.1"

    object AndroidX {
        const val activityCompose = "1.4.0"
        const val annotation = "1.1.0"
        const val appcompat = "1.3.0"
        const val autofill = "1.1.0"
        const val browser = "1.3.0"
        const val biometric = "1.1.0"
        const val cardview = "1.0.0"
        const val compose = compose_version
        const val constraintlayout = "2.0.4"
        const val coordinatorlayout = "1.1.0"
        const val core = "1.3.2"
        const val fragment = "1.3.4"
        const val recyclerview = "1.2.0"
        const val test = "1.4.0"
        const val test_ext = "1.1.3"
        const val espresso = "3.3.0"
        const val room = "2.4.2"
        const val paging = "2.1.2"
        const val palette = "1.0.0"
        const val preferences = "1.1.1"
        const val lifecycle = "2.4.0"
        const val media = "1.2.0"
        const val navigation = "2.4.0-alpha04"
        const val work = "2.7.1"
        const val arch = "2.1.0"
        const val uiautomator = "2.2.0"
        const val localbroadcastmanager = "1.0.0"
        const val swiperefreshlayout = "1.1.0"
    }

    object Firebase {
        const val messaging = "23.0.8"
    }
}

// Synchronized dependencies used by (some) modules
@Suppress("Unused", "MaxLineLength")
object Dependencies {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

    const val testing_junit = "junit:junit:${Versions.junit}"
    const val testing_robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val testing_robolectric_playservices = "org.robolectric:shadows-playservices:${Versions.robolectric}"
    const val testing_mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val testing_mockwebserver = "com.squareup.okhttp3:mockwebserver:${Versions.mockwebserver}"
    const val testing_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val testing_maven_ant_tasks = "org.apache.maven:maven-ant-tasks:${Versions.maven_ant_tasks}"
    const val testing_leakcanary = "com.squareup.leakcanary:leakcanary-android-instrumentation:${Versions.leakcanary}"

    const val androidx_activity_compose = "androidx.activity:activity-compose:${Versions.AndroidX.activityCompose}"
    const val androidx_annotation = "androidx.annotation:annotation:${Versions.AndroidX.annotation}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
    const val androidx_autofill = "androidx.autofill:autofill:${Versions.AndroidX.autofill}"
    const val androidx_arch_core_common = "androidx.arch.core:core-common:${Versions.AndroidX.arch}"
    const val androidx_arch_core_testing = "androidx.arch.core:core-testing:${Versions.AndroidX.arch}"
    const val androidx_biometric = "androidx.biometric:biometric:${Versions.AndroidX.biometric}"
    const val androidx_browser = "androidx.browser:browser:${Versions.AndroidX.browser}"
    const val androidx_cardview = "androidx.cardview:cardview:${Versions.AndroidX.cardview}"
    const val androidx_compose_ui = "androidx.compose.ui:ui:${Versions.AndroidX.compose}"
    const val androidx_compose_ui_graphics = "androidx.compose.ui:ui-graphics:${Versions.AndroidX.compose}"
    const val androidx_compose_ui_test = "androidx.compose.ui:ui-test-junit4:${Versions.AndroidX.compose}"
    const val androidx_compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:${Versions.AndroidX.compose}"
    const val androidx_compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.AndroidX.compose}"
    const val androidx_compose_foundation = "androidx.compose.foundation:foundation:${Versions.AndroidX.compose}"
    const val androidx_compose_material = "androidx.compose.material:material:${Versions.AndroidX.compose}"
    const val androidx_compose_navigation = "androidx.navigation:navigation-compose:${Versions.AndroidX.navigation}"
    const val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintlayout}"
    const val androidx_core = "androidx.core:core:${Versions.AndroidX.core}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.AndroidX.core}"
    const val androidx_coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout:${Versions.AndroidX.coordinatorlayout}"
    const val androidx_fragment = "androidx.fragment:fragment:${Versions.AndroidX.fragment}"
    const val androidx_lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.lifecycle}"
    const val androidx_lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.lifecycle}"
    const val androidx_lifecycle_service = "androidx.lifecycle:lifecycle-service:${Versions.AndroidX.lifecycle}"
    const val androidx_lifecycle_process = "androidx.lifecycle:lifecycle-process:${Versions.AndroidX.lifecycle}"
    const val androidx_lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.AndroidX.lifecycle}"
    const val androidx_media = "androidx.media:media:${Versions.AndroidX.media}"
    const val androidx_paging = "androidx.paging:paging-runtime:${Versions.AndroidX.paging}"
    const val androidx_palette = "androidx.palette:palette-ktx:${Versions.AndroidX.palette}"
    const val androidx_preferences = "androidx.preference:preference-ktx:${Versions.AndroidX.preferences}"
    const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.AndroidX.recyclerview}"
    const val androidx_room_runtime = "androidx.room:room-ktx:${Versions.AndroidX.room}"
    const val androidx_room_compiler = "androidx.room:room-compiler:${Versions.AndroidX.room}"
    const val androidx_room_testing = "androidx.room:room-testing:${Versions.AndroidX.room}"
    const val androidx_test_core = "androidx.test:core-ktx:${Versions.AndroidX.test}"
    const val androidx_test_junit = "androidx.test.ext:junit-ktx:${Versions.AndroidX.test_ext}"
    const val androidx_test_runner = "androidx.test:runner:${Versions.AndroidX.test}"
    const val androidx_test_rules = "androidx.test:rules:${Versions.AndroidX.test}"
    const val androidx_test_uiautomator = "androidx.test.uiautomator:uiautomator:${Versions.AndroidX.uiautomator}"
    const val androidx_work_runtime = "androidx.work:work-runtime-ktx:${Versions.AndroidX.work}"
    const val androidx_work_testing = "androidx.work:work-testing:${Versions.AndroidX.work}"
    const val androidx_espresso_core = "androidx.test.espresso:espresso-core:${Versions.AndroidX.espresso}"
    const val androidx_localbroadcastmanager = "androidx.localbroadcastmanager:localbroadcastmanager:${Versions.AndroidX.localbroadcastmanager}"
    const val androidx_swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.AndroidX.swiperefreshlayout}"

    const val google_material = "com.google.android.material:material:${Versions.material}"

    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"

    const val tools_androidgradle = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val tools_kotlingradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val tools_lint = "com.android.tools.lint:lint:${Versions.lint}"
    const val tools_lintapi = "com.android.tools.lint:lint-api:${Versions.lint}"
    const val tools_lintchecks = "com.android.tools.lint:lint-checks:${Versions.lint}"
    const val tools_linttests = "com.android.tools.lint:lint-tests:${Versions.lint}"

    const val tools_detekt_api = "io.gitlab.arturbosch.detekt:detekt-api:${Versions.detekt}"
    const val tools_detekt_test = "io.gitlab.arturbosch.detekt:detekt-test:${Versions.detekt}"

    val mozilla_geckoview = "org.mozilla.geckoview:${Gecko.channel.artifactName}:${Gecko.version}"
    const val mozilla_fxa = "org.mozilla.appservices:fxaclient:${Versions.mozilla_appservices}"
    const val mozilla_nimbus = "org.mozilla.appservices:nimbus:${Versions.mozilla_appservices}"
    const val mozilla_glean_forUnitTests = "org.mozilla.telemetry:glean-native-forUnitTests:${Versions.mozilla_glean}"
    const val mozilla_sync_autofill = "org.mozilla.appservices:autofill:${Versions.mozilla_appservices}"
    const val mozilla_sync_logins = "org.mozilla.appservices:logins:${Versions.mozilla_appservices}"
    const val mozilla_places = "org.mozilla.appservices:places:${Versions.mozilla_appservices}"
    const val mozilla_sync_manager = "org.mozilla.appservices:syncmanager:${Versions.mozilla_appservices}"
    const val mozilla_push = "org.mozilla.appservices:push:${Versions.mozilla_appservices}"
    const val mozilla_remote_tabs = "org.mozilla.appservices:tabs:${Versions.mozilla_appservices}"
    const val mozilla_httpconfig = "org.mozilla.appservices:httpconfig:${Versions.mozilla_appservices}"
    const val mozilla_full_megazord = "org.mozilla.appservices:full-megazord:${Versions.mozilla_appservices}"
    const val mozilla_full_megazord_forUnitTests = "org.mozilla.appservices:full-megazord-forUnitTests:${Versions.mozilla_appservices}"

    const val mozilla_errorsupport = "org.mozilla.appservices:errorsupport:${Versions.mozilla_appservices}"
    const val mozilla_rustlog = "org.mozilla.appservices:rustlog:${Versions.mozilla_appservices}"
    const val mozilla_sync15 = "org.mozilla.appservices:sync15:${Versions.mozilla_appservices}"

    const val thirdparty_okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val thirdparty_okhttp_urlconnection = "com.squareup.okhttp3:okhttp-urlconnection:${Versions.okhttp}"
    const val thirdparty_sentry_legacy = "io.sentry:sentry-android:${Versions.sentry_legacy}"
    const val thirdparty_sentry_latest = "io.sentry:sentry-android:${Versions.sentry_latest}"
    const val thirdparty_zxing = "com.google.zxing:core:${Versions.zxing}"
    const val thirdparty_jna = "net.java.dev.jna:jna:${Versions.jna}@jar"
    const val thirdparty_disklrucache = "com.jakewharton:disklrucache:${Versions.disklrucache}"

    const val firebase_messaging = "com.google.firebase:firebase-messaging:${Versions.Firebase.messaging}"
}
