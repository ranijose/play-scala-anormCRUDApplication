package controllers

import javax.inject.Inject

import play.api.data.Forms._
import play.api.data._
import play.api.i18n._
import play.api.mvc._

class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

 val Home=Redirect(routes.HomeController.list(0, 2, ""))


def index=Action{
 Home
}


}
