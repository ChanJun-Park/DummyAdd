plugins {
	alias(libs.plugins.jetbrains.kotlin.jvm)
	id("maven-publish")
}

kotlin {
	jvmToolchain(17)
}

publishing {
	publications {
		register<MavenPublication>("release") {
			groupId = "com.jingom.kotlin"
			artifactId = "dummy-add"
			version = "1.0"

			afterEvaluate {
				from(components["java"])
			}
		}
	}
}