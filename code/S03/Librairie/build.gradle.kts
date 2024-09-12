plugins {
    kotlin("jvm") version "2.0.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jsoup:jsoup:1.18.1")
    // https://mvnrepository.com/artifact/org.apache.commons/commons-email
    implementation("org.apache.commons:commons-email:1.6.0")
    // https://mvnrepository.com/artifact/commons-io/commons-io
    implementation("commons-io:commons-io:2.16.1")
    // https://mvnrepository.com/artifact/commons-validator/commons-validator
    implementation("commons-validator:commons-validator:1.9.0")



}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}