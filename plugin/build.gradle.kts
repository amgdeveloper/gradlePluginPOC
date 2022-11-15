
plugins {
    // Apply the Java Gradle plugin development plugin to add support for developing Gradle plugins
    `java-gradle-plugin`

    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.6.21"
    java
    `maven-publish` //Adding this because `maven` is not resolved
}

group = "com.my.company"
version = "1.0.0"


repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

gradlePlugin {
    plugins {
        create("customSamplePlugin") {
            id = "com.my.company.customSamplePlugin"
            implementationClass = "plugin.MyDecryptionPlugin"
        }
    }
}


//publishing {
//
//    publications {
//        create<MavenPublication>("maven") {
//            groupId = "com.my.company"
//            artifactId = "customSamplePlugin"
//            version = "1.4"
//
//            from(components["kotlin"])
//        }
//    }
//}



