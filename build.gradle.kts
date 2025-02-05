plugins {
    kotlin("jvm") version "1.4.32" apply false
}

repositories {
    mavenCentral()
    jcenter()
}

allprojects {
    group = "ru.vtb"

    repositories {
        maven(url = "https://jitpack.io")
        maven(url = "https://kotlin.bintray.com/kotlinx")
        mavenCentral()
        jcenter()
    }
}
