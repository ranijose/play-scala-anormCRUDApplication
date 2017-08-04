
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/deepak/scalaPlayProjects/play-scala-anormCRUDApplication/conf/routes
// @DATE:Wed Aug 02 22:06:17 BST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
