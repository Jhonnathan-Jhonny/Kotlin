plugins {
    kotlin("jvm") version "1.8.20" // Update to a more recent version of Kotlin
    id("com.github.johnrengelman.shadow") version "7.1.0" // Ensure the plugin is also updated
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.ajalt.clikt:clikt:3.2.0")
    implementation("org.jetbrains.exposed:exposed-core:0.33.1")
    implementation("org.jetbrains.exposed:exposed-dao:0.33.1")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.33.1")
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")
    implementation("org.slf4j:slf4j-simple:1.7.32")
    implementation("com.github.ajalt.mordant:mordant:2.0.0-beta2")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
}
