val End2EndTest = config("e2e") extend Runtime describedAs "End2End testing configuration"

val End2EndTestSettings =
     inConfig(End2EndTest)(Defaults.testSettings) ++
       Seq(
         fork in End2EndTest := false,
         parallelExecution in End2EndTest := false,
         scalaSource in End2EndTest := baseDirectory.value / "src/e2e/scala"
      )

lazy val root = project
  .in(file("."))
  .settings(
    End2EndTestSettings ++
    Seq(
      scalaVersion := "2.11.7",
      version := "0.1",
      libraryDependencies += "org.specs2" %% "specs2-core" % "3.6.3"
    )
  )
  .configs(End2EndTest)
