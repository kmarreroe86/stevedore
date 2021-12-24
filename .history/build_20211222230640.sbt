val commonSettings = Seq(
    scalaVersion := "3.1.0-RC2"
)

val server = project.settings()

val client = project.settings()

val root = project
  .in(file("."))
  .settings()
  .aggregate(server, client)
