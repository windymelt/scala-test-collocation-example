val scala3Version = "3.5.0"

// Thanks to https://discord.com/channels/632150470000902164/922600050989875282/1285830933030633557
// make compile sources directory and test sources directory be the same directory
Compile / unmanagedSourceDirectories := Seq(baseDirectory.value / "src")
Test / unmanagedSourceDirectories := (Compile / unmanagedSourceDirectories).value

// `*.test.scala` are test sources; all other `*.scala` files are compile sources
Compile / unmanagedSources / fileInputIncludeFilter := "**/*.scala"
Test / unmanagedSources / fileInputIncludeFilter    := "**/*.test.scala"
Compile / unmanagedSources / fileInputExcludeFilter := (Test / unmanagedSources / fileInputIncludeFilter).value
Test / unmanagedSources / fileInputExcludeFilter := sbt.nio.file.PathFilter
  .fromFileFilter(sbt.io.NothingFilter)

lazy val root = project
  .in(file("."))
  .settings(
    name                                   := "ScalaTest Collocation Example",
    publish / skip                          := true,
    version                                := "0.1.0-SNAPSHOT",
    scalaVersion                           := scala3Version,
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.19",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test",
  )
