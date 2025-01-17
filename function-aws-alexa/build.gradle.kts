plugins {
    id("io.micronaut.build.internal.aws-module")
}

dependencies {
    annotationProcessor(mn.micronaut.validation)
    implementation(mn.micronaut.runtime)
    implementation(mn.micronaut.validation)
    implementation(projects.functionAws)
    api(libs.managed.alexa.ask.sdk.lambda)
    api(projects.awsAlexa)
    runtimeOnly(libs.jcl.over.slf4j)
    testAnnotationProcessor(mn.micronaut.inject.java)
    testImplementation(libs.managed.alexa.ask.sdk) {
        isTransitive = false
    }
    testImplementation(libs.alexa.ask.sdk.apache.client)
}
