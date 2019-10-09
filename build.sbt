organization := "com.github.writethemfirst"
scalaVersion := "2.12.10"
libraryDependencies ++= Seq(scalaTest, approvalsJava)
resolvers += Resolver.bintrayRepo("writethemfirst", "maven")
resolvers += Resolver.mavenLocal

val approvalsVersion = "0.12.0"

version := approvalsVersion

lazy val scalaTest     = "org.scalatest"             %% "scalatest"       % "3.0.8"          % Test
lazy val approvalsJava = "com.github.writethemfirst" %% "approvals-scala" % approvalsVersion % Test

// Uncomment the next 2 lines for auto-approbation
ThisBuild / Test / fork := true
ThisBuild / Test / javaOptions += "-DAUTO_APPROVE=true"
