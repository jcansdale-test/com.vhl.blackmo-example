plugins {
    `java-library`
}

repositories {
    jcenter()
    maven {
        name = "remote"
        // Adapt the URL for your remote repository
        url = uri("https://maven.pkg.github.com/blackmo18/kotlin-grass")
        credentials { 
            // Use this if the repo requires auth 
            // see https://docs.gradle.org/6.4/userguide/declaring_repositories.html#sec:supported_transport_protocols
            username = System.getenv("USERNAME")
            password = System.getenv("TOKEN")
        }
    }
}

group = "org.test.consume"
version = "1.0-SNAPSHOT"

dependencies {
    api("org.apache.commons:commons-math3:3.6.1")

    implementation("com.google.guava:guava:28.0-jre")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.1")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.1")
    
    compile("com.vhl.blackmo:kotlin-grass-jvm:0.0.1")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}
