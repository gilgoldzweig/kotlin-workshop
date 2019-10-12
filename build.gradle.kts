import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.41"
}

group = "android.academy"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
//    compile(kotlin())
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.9"
}
