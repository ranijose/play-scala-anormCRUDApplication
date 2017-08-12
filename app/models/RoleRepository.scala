package models

import javax.inject.Inject

import play.api.db.DBApi

import anorm._


case class Role(id:Int,name:String)


@javax.inject.Singleton
class RoleRepository @Inject()(dbapi: DBApi)(implicit ec: DatabaseExecutionContext){

 private val db=dbapi.database("usermanagement")
}
