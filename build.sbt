organization := "com.github.writethemfirst"
version := "0.1-SNAPSHOT"
scalaVersion := "2.12.7"
libraryDependencies ++= Seq(scalaTest, approvalsJava)
resolvers += Resolver.bintrayRepo("writethemfirst", "maven")

lazy val scalaTest     = "org.scalatest"             %% "scalatest"     % "3.0.5" % Test
lazy val approvalsJava = "com.github.writethemfirst" % "approvals-java" % "0.5.1" % Test
