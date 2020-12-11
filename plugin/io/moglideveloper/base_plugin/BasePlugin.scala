package io.moglideveloper.base_plugin

import sbt._

object BasePlugin extends AutoPlugin {

  lazy val hello = taskKey[Unit]("just say hello")

  override def trigger = allRequirements

  override lazy val projectSettings = Seq(
    hello := {
      println("hello")
    }
  )
}