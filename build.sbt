organization := "com.github.writethemfirst"
version := "0.1-SNAPSHOT"
scalaVersion := "2.12.6"
libraryDependencies ++= Seq(scalaTest, approvalsJava)

lazy val scalaTest     = "org.scalatest"             %% "scalatest"     % "3.0.4" % Test
lazy val approvalsJava = "com.github.writethemfirst" % "approvals-java" % "0.4.1" % Test
