lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.12.2",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies ++= Seq(
      "org.apache.logging.log4j"          % "log4j-core"              % "2.8.2",
      "org.apache.logging.log4j"          % "log4j-slf4j-impl"        % "2.8.2",
      "org.apache.logging.log4j"          % "log4j-api"               % "2.8.2",
      "com.fasterxml.jackson.dataformat"  % "jackson-dataformat-yaml" % "2.8.9",
      "com.fasterxml.jackson.core"        % "jackson-databind"        % "2.8.9",
      "com.typesafe.scala-logging"        %% "scala-logging"          % "3.6.0"
    ) 
  )
