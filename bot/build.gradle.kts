plugins {
    kotlin("jvm") version "1.9.23"
}

group = "space.insyri"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("dev.kord:kord-core:0.13.1")
}

kotlin {
    jvmToolchain(18)
}