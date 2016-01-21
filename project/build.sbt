resolvers ++= Seq(
  "Artima Maven Repository" at "http://repo.artima.com/releases",
  Classpaths.sbtPluginReleases
)

addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.0-RC6")
