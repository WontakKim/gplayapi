plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.google.protobuf)
    alias(libs.plugins.jetbrains.kotlinx.serialization)

    `java-library`
    `maven-publish`
    signing
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.logging)

    implementation(libs.squareup.okhttp3)
    implementation(libs.google.protobuf)
    implementation(libs.google.gson)
    implementation(libs.jetbrains.kotlinx.coroutines)
    implementation(libs.jetbrains.kotlinx.serialization)

    // Use the Kotlin JUnit 5 integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:${libs.versions.protobuf.javalite.get()}"
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                named("java") {
                    option("lite")
                }
            }
        }
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

afterEvaluate {
    publishing {
        publications {
            register<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.github.wontakkim"
                artifactId = "gplayapi"
                version = "1.0.0"
                pom {
                    name.set("gplayapi")
                    description.set("")
                }
            }
        }
    }
}