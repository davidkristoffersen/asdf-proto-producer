plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.protobuf)
    id("maven-publish")
}

android {
    namespace = "com.example.asdfprotoproducer"
    compileSdk = 34

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    publishing {
        publishing {
            singleVariant("release") {
                withSourcesJar()
                withJavadocJar()
            }
        }
    }
}


dependencies {
    // Core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    // GRPC
    implementation(libs.protobuf)
    implementation(libs.grpc.okhttp)
    implementation(libs.grpc.protobuf.lite)
    implementation(libs.grpc.stub)
    implementation(libs.javax.annotation) {
        version {
            strictly(libs.versions.annotation.get())
        }
    }

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

protobuf {
    protoc {
        artifact = if (osdetector.os == "osx") {
            "com.google.protobuf:protoc:${libs.versions.protobuf.get()}:osx-x86_64"
        } else {
            "com.google.protobuf:protoc:${libs.versions.protobuf.get()}"
        }
    }
    plugins {
        create("grpc") {
            artifact = if (osdetector.os == "osx") {
                "io.grpc:protoc-gen-grpc-java:${libs.versions.grpc.get()}:osx-x86_64"
            } else {
                "io.grpc:protoc-gen-grpc-java:${libs.versions.grpc.get()}"
            }
        }
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                create("java") {
                    option("lite")
                }
            }
            task.plugins {
                create("grpc") {
                    option("lite")
                }
            }
        }
    }
}

afterEvaluate {
    publishing {
        publications {
            register<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.github.davidkristoffsersen"
                artifactId = "asdf-proto-producer"
                version = "1.0.0"
            }
        }
    }
}
