object RootProject {
    const val owner = "stachu540"
    const val name = "kotlin-dsl-tempate"
    const val slug = "$owner/$name"
    const val githubUrl = "https://github.com/$slug"
    const val scmHttps = "scm:git:$githubUrl.git"
    const val scmSsh = "scm:git:git@github.com:$slug.git"

    const val wikiUrl = "$githubUrl/wiki"
    const val ciUrl = "$githubUrl/actions"
    const val dlUrl = "$githubUrl/releases"
    const val mitLicense = "$githubUrl/blob/master/LICENCE.md"
    const val issues = "$githubUrl/issues"
    const val pullRequests = "$githubUrl/pulls"
}