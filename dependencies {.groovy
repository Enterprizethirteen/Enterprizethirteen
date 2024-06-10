dependencies {
    // Import the BoM for the Firebase platform
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))

    // Add the dependencies for the Crashlytics and Analytics libraries
    // When using the BoM, you don't specify versions in Firebase library dependencies
    implementation("com.google.firebase:firebase-crashlytics")
    implementation("com.google.firebase:firebase-analytics")
}plugins {
    // Make sure that you have the AGP plugin 8.1+ dependency
    id("com.android.application") version "8.1.4" apply false
    // ...

    // Make sure that you have the Google services Gradle plugin 4.4.1+ dependency
    id("com.google.gms.google-services") version "4.4.2" apply false

    // Add the dependency for the Crashlytics Gradle plugin
    id("com.google.firebase.crashlytics") version "3.0.1" apply false
}plugins {
    id("com.android.application")

    // Make sure that you have the Google services Gradle plugin
    id("com.google.gms.google-services")

    // Add the Performance Monitoring Gradle plugin
    id("com.google.firebase.firebase-perf")
    ...
}