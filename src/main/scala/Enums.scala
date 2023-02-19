import java.security.Permission
object Enums extends App {
  enum Permissions {
    case READ, WRITE, EXECUTE, NONE
    // add fields or methods
    def openDocument(): Unit =
      if (this == READ) println("Opening Document...")
      else println("reading not allowed.")
  }

//   Enum Constructor args
  enum PermissionsWithBits(bits: Int) {
    case READ extends PermissionsWithBits(4)
    case WRITE extends PermissionsWithBits(2)
    case EXECUTE extends PermissionsWithBits(1)
    case NONE extends PermissionsWithBits(0)
  }

  object PermissionsWithBits {
    def fromBits(bits: Int): PermissionsWithBits =
      PermissionsWithBits.NONE
  }

  val somePermissions: Permissions = Permissions.READ

  somePermissions.openDocument()

}
