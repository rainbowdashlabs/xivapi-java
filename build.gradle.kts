plugins {
    java
    `java-library`
    `maven-publish`
    id("de.chojo.publishdata") version "1.0.8"
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
    api("com.bucket4j", "bucket4j-core", "8.1.0")
    api("org.jetbrains", "annotations", "23.0.0")
    api("com.google.code.findbugs", "jsr305", "3.0.2")
    api("org.slf4j", "slf4j-api", "2.0.3")
    api("org.apache.httpcomponents.client5", "httpclient5", "5.1.3")
    api("com.fasterxml.jackson.core", "jackson-databind", "2.13.4")

    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.9.2")
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", "5.9.2")
    testImplementation("org.mockito", "mockito-core", "3.+")
    testImplementation("org.apache.logging.log4j", "log4j-core", "2.19.0")
    testImplementation("org.apache.logging.log4j", "log4j-slf4j2-impl", "2.19.0")

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
