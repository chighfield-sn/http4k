import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val org_jetbrains_kotlinx_kotlinx_serialization: String = "1.0.1"

    const val com_fasterxml_jackson_dataformat: String = "2.11.3"

    const val io_github_resilience4j: String = "1.6.1"

    const val software_amazon_awssdk: String = "2.15.35"

    const val org_jetbrains_kotlin: String = "1.4.20"

    const val com_squareup_moshi: String = "1.11.0"

    const val org_eclipse_jetty: String = "9.4.35.v20201120"

    const val org_junit_jupiter: String = "5.7.0"

    const val io_opentelemetry: String = "0.9.1"

    const val dev_forkhandles: String = "1.6.0.0"

    const val io_undertow: String = "2.2.2.Final"

    const val io_ktor: String = "1.4.1" // ignore: "1.4.2"

    const val com_microsoft_azure_azurefunctions_gradle_plugin: String = "1.5.0"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

    const val com_github_kt3k_coveralls_gradle_plugin: String = "2.10.2"

    const val com_jfrog_bintray_gradle_plugin: String = "1.8.5"

    const val graphql_kotlin_schema_generator: String = "3.6.7"

    const val openapi_generator_gradle_plugin: String = "4.3.1"

    const val azure_functions_java_library: String = "1.4.0"

    const val javax_websocket_server_impl: String = "9.4.35.v20201120"

    const val kotest_assertions_core_jvm: String = "4.3.1"

    const val coveralls_gradle_plugin: String = "2.8.3"

    const val functions_framework_api: String = "1.0.2"

    const val aws_lambda_java_events: String = "3.6.0"

    const val jackson_module_kotlin: String = "2.11.3"

    const val aws_lambda_java_core: String = "1.2.1"

    const val dokka_gradle_plugin: String = "0.10.1" // ignore: "1.4.10.2"

    const val javax_servlet_api: String = "4.0.1"

    const val netty_codec_http2: String = "4.1.52.Final" // ignore: "4.1.54.Final"

    const val jackson_databind: String = "2.11.3"

    const val httpasyncclient: String = "4.1.4"

    const val micrometer_core: String = "1.6.1"

    const val scf_java_events: String = "0.0.2"

    const val fc_java_common: String = "2.2.2"

    const val java_websocket: String = "1.5.1"

    const val commons_pool2: String = "2.9.0"

    const val graphql_java: String = "16.1"

    const val http2_server: String = "9.4.35.v20201120"

    const val ratpack_core: String = "1.8.0"

    const val selenium_api: String = "3.141.59"

    const val httpclient5: String = "5.0.3"

    const val freemarker: String = "2.3.30"

    const val handlebars: String = "4.2.0"

    const val httpclient: String = "4.5.13"

    const val underscore: String = "1.60"

    const val alpn_boot: String = "8.1.13.v20181017"

    const val httpcore5: String = "5.0.2"

    const val joda_time: String = "2.10.8"

    const val slf4j_nop: String = "1.7.30"

    const val thymeleaf: String = "3.0.11.RELEASE"

    const val hamkrest: String = "1.8.0.1"

    const val httpcore: String = "4.4.13"

    const val jade4j: String = "1.3.2"

    const val okhttp: String = "4.9.0"

    const val pebble: String = "3.1.4"

    const val shadow: String = "6.1.0"

    const val jsoup: String = "1.13.1"

    const val argo: String = "5.14"

    const val gson: String = "2.8.6"

    const val json: String = "20201115"

    const val klaxon: String = "5.4"

    /**
     * Current version: "6.7"
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "6.7.1"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
        id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
