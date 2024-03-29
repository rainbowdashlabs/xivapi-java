plugins {
    java
    `java-library`
    `maven-publish`
    id("de.chojo.publishdata") version "1.2.5"
    id("org.cadixdev.licenser") version "0.6.1"
}

group = "de.chojo"
version = "1.0"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
    withJavadocJar()
    withSourcesJar()
}

dependencies {
    api("com.bucket4j", "bucket4j-core", "8.7.1")
    api("org.jetbrains", "annotations", "24.1.0")
    api("com.google.code.findbugs", "jsr305", "3.0.2")
    api("org.slf4j", "slf4j-api", "2.0.11")
    api("org.apache.httpcomponents.client5", "httpclient5", "5.2.1")
    api("com.fasterxml.jackson.core", "jackson-databind", "2.16.1")

    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.10.2")
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", "5.10.2")
    testImplementation("org.mockito", "mockito-core", "5.+")
    testImplementation("org.apache.logging.log4j", "log4j-core", "2.22.1")
    testImplementation("org.apache.logging.log4j", "log4j-slf4j2-impl", "2.22.1")

}

license {
    header(rootProject.file("HEADER.txt"))
    include("**/*.java")
}

publishData {
    useEldoNexusRepos(true)
    publishComponent("java")
}

tasks {

    compileJava {
        options.encoding = "UTF-8"
    }

    javadoc {
        options.encoding = "UTF-8"
    }

    test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }
}
