// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.ANDROID_APPLICATION) version Versions.AGP apply false
    id(Plugins.KOTLIN_ANDROID) version Versions.KOTLIN apply false
    id(Plugins.SECRETS_GRADLE_PLUGIN) version Versions.SECRETS_GRADLE apply false
    id(Plugins.KSP) version Versions.KSP apply false
    id(Plugins.SAFEARGS) version Versions.SAFEARGS apply false
    id(Plugins.KOTLIN_SERIALIZATION) version Versions.P_KOTLIN_SERIALIZATION apply false
    id(Plugins.DAGGER_HILT) version Versions.HILT_PLUGIN apply false

}