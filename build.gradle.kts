plugins {
    java
    // spring boot plugin
    id("org.springframework.boot") version "3.0.5" apply false
    // spring dependency management
    id("io.spring.dependency-management") version "1.1.0" apply false
}

group = "com.hihusky"
version = "1.0-SNAPSHOT"

ext {
    set("springBootVersion", "3.0.5")
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

subprojects {
    // java plugin
    apply(plugin = "java")
    // spring boot plugin
    apply(plugin = "org.springframework.boot")
    // spring boot dependency management plugin
    apply(plugin = "io.spring.dependency-management")

    repositories {
        mavenCentral()
    }

    dependencies {
        // spring boot
        implementation("org.springframework.boot:spring-boot-starter")
        // spring boot test
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        // spring boot devtools
        implementation("org.springframework.boot:spring-boot-devtools")
        // lombok for compile only
        compileOnly("org.projectlombok:lombok")
        // lombok for annotation processor
        annotationProcessor("org.projectlombok:lombok")
        // lombok for test compile only
        testCompileOnly("org.projectlombok:lombok")
        // lombok for test annotation processor
        testAnnotationProcessor("org.projectlombok:lombok")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

