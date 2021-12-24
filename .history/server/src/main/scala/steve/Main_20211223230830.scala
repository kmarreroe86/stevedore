package steve

case class Build(base: Build.Base, commands: List[Command])

object Build {
    enum Base {
        case Empty
    }
}

enum Command {
  case PUT, DELETE
}

case class Hash(value: Array[Byte])
