ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.10"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.49" % "test"
libraryDependencies += "org.hamcrest" % "hamcrest-library" % "2.2" % "test"

lazy val root = (project in file("."))
  .settings(
    name := "Bowling"
  )
