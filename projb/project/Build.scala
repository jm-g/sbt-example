import sbt._
import Keys._

object ProjectB extends Build {

  lazy val projb = Project( "projb", file(".")) dependsOn proja aggregate proja

  lazy val proja = ProjectRef(uri("../proja"), "proja")
}
