plugins {
    application
    kotlin("jvm") version "1.2.60"
    kotlin("kapt") version "1.2.60"
}

application {
    mainClassName = "samples.HelloAutoValueKt"
}

repositories {
    jcenter()
}

dependencies {
    compileOnly("com.google.auto.value:auto-value-annotations:1.6.2")
    kapt("com.google.auto.value:auto-value:1.6.2")

    compile(kotlin("stdlib"))

    testCompile("junit:junit:4.12")
}

kapt {
    correctErrorTypes = true

    javacOptions {
        option("SomeJavacOption", "OptionValue")
    }

    arguments {
        arg("SomeKaptArgument", "ArgumentValue")
    }
}
