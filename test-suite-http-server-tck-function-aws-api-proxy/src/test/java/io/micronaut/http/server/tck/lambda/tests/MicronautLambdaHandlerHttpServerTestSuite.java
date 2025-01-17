package io.micronaut.http.server.tck.lambda.tests;

import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectPackages("io.micronaut.http.server.tck.tests")
@SuiteDisplayName("HTTP Server TCK for Function AWS API Proxy")
@ExcludeClassNamePatterns(value =
    "io.micronaut.http.server.tck.tests.RemoteAddressTest" + // CaptureRemoteAddressFiter throws NPE getting the address
    "|io.micronaut.http.server.tck.tests.cors.CorsSimpleRequestTest" + // Fails as port cannot be resolved
    "|io.micronaut.http.server.tck.tests.BodyTest" + // Fails with a multi-value publisher as the body type
    "|io.micronaut.http.server.tck.tests.ErrorHandlerTest" + // 2 tests Fail as CORs headers are not added to the response after deserialization fails
    ""
)
public class MicronautLambdaHandlerHttpServerTestSuite {
}
