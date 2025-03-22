import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.0"
    java
    `maven-publish`
}

group = "uk.co.sallery"
version = "0.0.4"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-client-java-jvm:3.1.1")
    implementation("io.ktor:ktor-client-core-jvm:3.1.1")
    implementation("io.ktor:ktor-network-jvm:3.1.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

//tasks.withType<KotlinCompile> {
//    kotlinOptions.jvmTarget = "1.8"
//}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "uk.co.sallery"
            artifactId = "skydance"
            version = "0.0.4"

            from(components["java"])
        }
    }
}