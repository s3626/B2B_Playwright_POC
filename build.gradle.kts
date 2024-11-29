plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/com.microsoft.playwright/playwright
    testImplementation("com.microsoft.playwright:playwright:1.49.0")

    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.3")

}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
