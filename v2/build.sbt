lazy val Versions = new {
  val scalaVersion = "2.12.0"
}

libraryDependencies ++=  Seq(
  "org.scalaj" %% "scalaj-http" % "2.4.2",
  "com.typesafe.play" %% "play-json" % "2.7.3",
  "org.apache.commons" % "commons-lang3" % "3.9"
)

lazy val root = (project in file("."))
    .settings(
      name := "Zendesk-Coding-Challange_2.0",
      scalaVersion := Versions.scalaVersion
    )
