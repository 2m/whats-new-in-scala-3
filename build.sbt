val dottyVersion = "0.14.0-bin-2019025-7343e23-NIGHTLY"

lazy val `whats-new` = project
  .in(file("."))
  .settings(
    name := "whats-new",
    scalaVersion := dottyVersion,
  )
