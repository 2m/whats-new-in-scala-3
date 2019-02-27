val dottyVersion = "0.13.0-RC1"

lazy val `whats-new` = project
  .in(file("."))
  .settings(
    name := "whats-new",
    scalaVersion := dottyVersion,
  )
