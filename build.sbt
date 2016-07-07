import sbt.Keys._

name := "minimal-scala"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

val commonSettings = Seq(
  scalaVersion := "2.11.8",
  libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  version := "1.0"
)

lazy val root = (project in file("."))
    .settings(commonSettings)
    .dependsOn(incl1)

lazy val incl1 = (project in file("incl1"))
    .settings(commonSettings)
