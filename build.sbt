organization := "com.github.writethemfirst"
scalaVersion := "2.12.10"
libraryDependencies ++= Seq(approvalsScala)
resolvers += Resolver.bintrayRepo("writethemfirst", "maven")
resolvers += Resolver.mavenLocal

val approvalsVersion = "0.13.0"

version := approvalsVersion

lazy val approvalsScala = "com.github.writethemfirst" %% "approvals-scala" % approvalsVersion % Test

// Uncomment the next 2 lines for auto-approbation
ThisBuild / Test / fork := true
ThisBuild / Test / javaOptions += "-DAUTO_APPROVE=true"
