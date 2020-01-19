import org.gradle.api.publish.maven.MavenPom
import org.gradle.api.publish.maven.MavenPomDeveloperSpec
import org.gradle.api.publish.maven.MavenPomLicenseSpec

fun MavenPom.default() {
    url.set(RootProject.githubUrl)
    issueManagement {
        system.set("GitHub")
        url.set(RootProject.issues)
    }
    ciManagement {
        system.set("Travis-CI")
        url.set(RootProject.ciUrl)
    }
    inceptionYear.set("2019")
    developers { all }
    licenses { mit("repo", RootProject.mitLicense) }
    scm {
        connection.set(RootProject.scmHttps)
        developerConnection.set(RootProject.scmSsh)
        url.set(RootProject.githubUrl)
    }
    distributionManagement { downloadUrl.set(RootProject.dlUrl) }
}

fun MavenPomLicenseSpec.mit(distribution: String, url: String) {
    license {
        name.set("MIT Licence")
        this.distribution.set(distribution)
        this.url.set(url)
    }
}

val MavenPomDeveloperSpec.all: Unit
    get() {
        stachu540
    }