
scalaVersion := "2.12.8"

lazy val root = (project in file("."))
  .dependsOn(playApp)
  .aggregate(playApp)
  .settings(
    skip in publish := true
  )

lazy val playApp = (project in file("./common")).enablePlugins(PlayScala)
