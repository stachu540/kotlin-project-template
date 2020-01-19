plugins {
    kotlin("jvm") version Version.kotlin
    id("org.jetbrains.dokka") version Version.dokka
    id("com.jfrog.bintray") version Version.bintray
}
allprojects {
    repositories {
        jcenter()
    }

    tasks {
        withType<Test> {
            useJUnitPlatform()
        }
    }
}

dependencies {
    api(kotlin("stdlib-jdk8"))
    api(kotlin("reflect"))
    api("org.slf4j:slf4j-api:${Version.slf4j}")
    testApi("ch.qos.logback:logback-classic:${Version.logback}")
    testApi(kotlin("test-junit5"))
}

tasks {
    wrapper {
        gradleVersion = "6.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}

/*
 * Auto-Generate directories since IDEA-2019.2 option to auto-generate are removed intentionally
 * https://youtrack.jetbrains.com/issue/IDEA-215574
 */
afterEvaluate {
    allprojects {
        if (!projectDir.exists()) projectDir.mkdirs()
        with(File(projectDir, "build.gradle.kts")) {
            if (!exists()) createNewFile()
        }
        sourceSets.forEach {
            it.allSource.srcDirs.forEach {
                if (!it.exists()) it.mkdirs()
            }
        }
    }
}