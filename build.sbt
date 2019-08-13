organization := "com.github.writethemfirst"
version := "0.1-SNAPSHOT"
scalaVersion := "2.12.8"
libraryDependencies ++= Seq(scalaTest, approvalsJava, pprint)
resolvers += Resolver.bintrayRepo("writethemfirst", "maven")

lazy val scalaTest     = "org.scalatest"             %% "scalatest"     % "3.0.5" % Test
lazy val approvalsJava = "com.github.writethemfirst" % "approvals-java" % "0.10.0" % Test
lazy val pprint        = "com.lihaoyi"               %% "pprint"        % "0.5.3" % Test

//ThisBuild / Test / fork := true
//ThisBuild / Test / javaOptions += "-DAUTO_APPROVE=true"
