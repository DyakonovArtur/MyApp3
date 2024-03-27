pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MyApp1"
include(":app")
include(":second")
include(":third")
include(":3101")
include(":ugadaichislo")
include(":0102")
include(":0202")
include(":02021")
include(":rating")
