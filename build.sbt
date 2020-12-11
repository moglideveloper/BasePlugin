name := "base-plugin"

version := "0.1"

sbtPlugin := true

val prjctDirs = List("plugin")
unmanagedSourceDirectories in Compile ++= prjctDirs.map(dir => (baseDirectory in Compile).value / dir)

organization := "io.github.moglideveloper"

val pluginDeveloper = Developer("pluginDeveloper", "pluginDeveloper", "moglideveloper@gmail.com", url("https://github.com/moglideveloper"))
developers := List(pluginDeveloper)

homepage := Some(url("https://github.com/moglideveloper/BasePlugin"))
scmInfo := Some(ScmInfo(url("https://github.com/moglideveloper/BasePlugin"), "git@github.com:moglideveloper/BasePlugin.git"))

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

//below is not yet done

crossPaths := false

publishMavenStyle := true

publishConfiguration := publishConfiguration.value.withOverwrite(true)

publishTo := Some(Opts.resolver.sonatypeStaging)