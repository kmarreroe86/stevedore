val commonSettings = Seq(
    scalaVersion := "3.1.0",
    scalacOptions -= "-Xfatal-warnings",
    libraryDependencies ++= Seq(
        "org.typelevel" %% "cats-effect" % "3.2.9",
        "org.typelevel" %% "munit-cats-effect-3" % "1.0.6" % Test,
        // "org.typelevel" %% "cats-mtl" % "1.2.1",
    )
)

val server = project.settings(commonSettings)

val client = project.settings(commonSettings)

val root = project
  .in(file("."))
  .settings(publish := {})
  .aggregate(server, client)
