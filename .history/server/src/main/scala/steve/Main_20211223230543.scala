package steve

case class Build(base: Build.Base, commands: List[Command])

object Build {
    enum Base{}
}

enum Command {
  case PUT, DELETE
}
