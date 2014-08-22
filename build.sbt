name := "mb30_crm"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++=
  Seq(
    "log4j" % "log4j" % "1.2.17",
    "org.slf4j" % "slf4j-log4j12" % "1.6.6",
    "cglib" % "cglib" % "2.2",
    "joda-time" % "joda-time" % "2.1",
    "org.joda" % "joda-convert" % "1.2",
    "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
    "com.typesafe.play" %% "play-json" % "2.2.1",
    "org.scalacheck" %% "scalacheck" % "1.11.0",
    "org.scalatest" %% "scalatest" % "2.2.0",
    "junit" % "junit" % "4.10",
    "org.specs2" %% "specs2" % "1.12.3"
  )
