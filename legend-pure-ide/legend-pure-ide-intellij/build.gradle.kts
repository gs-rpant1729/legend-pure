plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.13.1"
}

group = "org.finos.legend.pure"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    // Required by intellijPlatform to resolve platform artifacts and tooling
    intellijPlatform {
        defaultRepositories()
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    // ANTLR 4 runtime (same version as legend-pure)
    implementation("org.antlr:antlr4-runtime:4.8")

    // ANTLR4 IntelliJ Adaptor for bridging ANTLR lexer/parser to IntelliJ PSI
    implementation("org.antlr:antlr4-intellij-adaptor:0.1")

    // Legend Pure dependencies (from local Maven build)
    implementation("org.finos.legend.pure:legend-pure-m4:5.56.1-SNAPSHOT")
    implementation("org.finos.legend.pure:legend-pure-m3-core:5.56.1-SNAPSHOT")
    implementation("org.finos.legend.pure:legend-pure-runtime-java-engine-interpreted:5.56.1-SNAPSHOT")

    // Eclipse Collections (used throughout legend-pure)
    implementation("org.eclipse.collections:eclipse-collections-api:11.1.0")
    implementation("org.eclipse.collections:eclipse-collections:11.1.0")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")

    intellijPlatform {
        // Use the locally installed IntelliJ IDEA Ultimate as the platform
        local("/Users/rohitpant/Applications/IntelliJ IDEA.app")
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "253"
            untilBuild = "253.*"
        }
    }
}

tasks {
    buildSearchableOptions {
        enabled = false
    }

    runIde {
        jvmArgs("-Xmx2g", "-XX:+UseG1GC")
    }

    test {
        useJUnitPlatform()
    }
}