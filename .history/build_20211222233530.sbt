val commonSettings = Seq(
    scalaVersion := "3.1.1"
)

val server = project.settings(commonSettings)

val client = project.settings(commonSettings)

val root = project
  .in(file("."))
  .settings(publish := {})
  .aggregate(server, client)
