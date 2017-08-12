package models

import javax.inject.Inject

import play.api.db.DBApi

case class User(id:Int,email:String,password:String,fullname:String,role_id:Int)



@javax.inject.Singleton
class UserRepository @Inject() (dbapi: DBApi)(implicit ec:DatabaseExecutionContext ){
 private val db= dbapi.database("usermanagement")
}
