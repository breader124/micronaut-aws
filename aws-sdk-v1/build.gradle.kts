plugins {
    id("io.micronaut.build.internal.aws-module")
}

dependencies {
    api(platform(libs.boms.aws.java.sdk.v1))
    api(libs.managed.aws.java.sdk.core)
    api(projects.awsCommon)
    runtimeOnly(libs.jcl.over.slf4j)
    testImplementation(mn.micronaut.http.server.netty)
    testRuntimeOnly(mn.snakeyaml)
}
