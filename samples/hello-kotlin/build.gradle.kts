plugins {
    application
    kotlin("jvm") version "1.2.60"
}

application {
    mainClassName = "samples.HelloWorldKt"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}
