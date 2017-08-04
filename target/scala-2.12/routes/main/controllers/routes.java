
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/deepak/scalaPlayProjects/play-scala-anormCRUDApplication/conf/routes
// @DATE:Wed Aug 02 22:06:17 BST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
