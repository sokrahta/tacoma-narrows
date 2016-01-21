name := "tacoma-narrows"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "Artima Maven Repository" at "http://repo.artima.com/releases",
  Classpaths.sbtPluginReleases
)

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
scalacOptions ++= Seq("-Yinline-warnings")

fork in Test := true
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oDF")

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
