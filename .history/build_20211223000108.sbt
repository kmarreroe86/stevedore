val commonSettings = Seq(
    scalaVersion := "3.1.0",
    scalacOptions -= "-Xfatal-warnings",
    libraryDependencies ++= Seq(
        "org.typelevel" %% "cats-effect" % "3.2.9"
    )
)

val server = project.settings(commonSettings)

val client = project.settings(commonSettings)

val root = project
  .in(file("."))
  .settings(publish := {})
  .aggregate(server, client)
