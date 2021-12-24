val server = project.settings()

val client = project.settings()

val root = project
  .in(file("."))
  .settings()
  .aggregate(server, client)
