package steve

case class Build(base: Build.Base, commands: List[Command])

object Build {

  enum Base {
    case Empty
    case Hash(hash: steve.Hash)
  }

}

enum Command {
  case PUT, DELETE
}

case class Hash(value: Array[Byte])
