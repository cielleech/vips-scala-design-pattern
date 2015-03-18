lazy val commonSettings = Seq(
  organization := "com.vipshop",
    version := "0.1.0",
      scalaVersion := "2.11.4"
      )

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
    settings(
        name := "vips-scala-design-patter"
	  )