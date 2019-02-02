import play.sbt.PlayImport.PlayKeys._

scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.12.8", "2.13.0-M5")

lazy val root = (project in file("."))
  .dependsOn(playApp)
  .aggregate(playApp)
  .settings(
    skip in publish := true
  )

lazy val playApp = (project in file("./common")).enablePlugins(PlayScala)
  .settings(
    playOmnidoc := false
  )
