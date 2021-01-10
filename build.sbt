name := "base-plugin"

version := "0.3"

sbtPlugin := true

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.2" % Test
libraryDependencies ++= Seq("com.whisk" %% "docker-testkit-scalatest" % "0.9.9",
  "com.whisk" %% "docker-testkit-impl-spotify" % "0.9.9")

//All these plugins will be available to projects
//that depends on builder-style-sbt-build or deps-plugin or base-plugin
addSbtPlugin("io.github.davidmweber" % "flyway-sbt" % "6.5.0")

val prjctDirs = List("plugin")
unmanagedSourceDirectories in Compile ++= prjctDirs.map(dir => (baseDirectory in Compile).value / dir)




organization := "io.github.moglideveloper"

val pluginDeveloper = Developer("pluginDeveloper", "pluginDeveloper", "moglideveloper@gmail.com", url("https://github.com/moglideveloper"))
developers := List(pluginDeveloper)

homepage := Some(url("https://github.com/moglideveloper/BasePlugin"))
scmInfo := Some(ScmInfo(url("https://github.com/moglideveloper/BasePlugin"), "git@github.com:moglideveloper/BasePlugin.git"))

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))



crossPaths := false

publishMavenStyle := true

publishConfiguration := publishConfiguration.value.withOverwrite(true)

publishTo := Some(Opts.resolver.sonatypeStaging)