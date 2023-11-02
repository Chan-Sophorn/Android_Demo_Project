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
        maven {
            url = uri("//Users/chansophorn/AndroidStudioProjects/Android_Demo_Project/app/repo/repo")
        }

        maven {
            url = uri("https://storage.googleapis.com/download.flutter.io")
        }
    }
}

rootProject.name = "Android_Demo"
include(":app")
 