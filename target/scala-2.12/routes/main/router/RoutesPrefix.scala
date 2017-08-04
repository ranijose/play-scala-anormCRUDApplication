
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/deepak/scalaPlayProjects/play-scala-anormCRUDApplication/conf/routes
// @DATE:Wed Aug 02 22:06:17 BST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
