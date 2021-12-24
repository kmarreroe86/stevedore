val commonSettings = Seq(
    scalaVersion := "3.1.0-RC2"
)

val server = project.settings(commonSettings)

val client = project.settings(commonSettings)

val root = project
  .in(file("."))
  .settings()
  .aggregate(server, client)
