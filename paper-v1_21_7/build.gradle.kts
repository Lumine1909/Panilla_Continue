plugins {
    id("io.papermc.paperweight.userdev")
}

dependencies {
    compileOnly(project(":panilla-api"))
    paperweight.paperDevBundle("1.21.8-R0.1-SNAPSHOT")
    implementation("de.tr7zw:item-nbt-api:2.15.2-SNAPSHOT")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}