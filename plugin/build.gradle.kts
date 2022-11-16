
plugins {
    `java-gradle-plugin`

    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.6.21"
    java
    `maven-publish`
}
group = "com.my.company"
version = "1.4.0"


repositories {
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

/* Define the gradle plugin using java-gradle-plugin */
gradlePlugin {
    plugins {
        create("thisIsMyPlugin") {
            //create("customSamplePlugin") {
            id = "com.my.company.myartifactid"
            implementationClass = "mysampleplugin.SecretsManagerPlugin"
        }
    }
}


publishing {

    publications {
        create<MavenPublication>("maven") {
            groupId = "com.my.company"
            artifactId = "myartifactid"
            version = "1.4.0"
            from(components["kotlin"])
        }
    }
}


java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
