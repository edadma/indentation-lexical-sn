name := "indentation-lexical-sn"

version := "0.9.1"

scalaVersion := "2.11.12"

nativeLinkStubs := true

nativeMode := "debug"

nativeLinkingOptions := Seq( s"-L/${baseDirectory.value}/native-lib" )

scalacOptions ++= Seq( "-deprecation", "-feature", "-language:postfixOps", "-language:implicitConversions", "-language:existentials" )

organization := "xyz.hyperreal"

resolvers += "Hyperreal Repository" at "https://dl.bintray.com/edadma/maven"

licenses := Seq("ISC" -> url("https://opensource.org/licenses/ISC"))

homepage := Some(url("https://github.com/edadma/" + name.value))

enablePlugins(ScalaNativePlugin)

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.1" % "test"

testFrameworks += new TestFramework( "utest.runner.Framework" )

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %%% "scala-parser-combinators" % "1.1.2"
)

mainClass in (Compile, run) := Some( "xyz.hyperreal." + name.value + ".Main" )

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra :=
  <scm>
    <url>git@github.com:edadma/{name.value}.git</url>
    <connection>scm:git:git@github.com:edadma/{name.value}.git</connection>
  </scm>
  <developers>
    <developer>
      <id>edadma</id>
      <name>Edward A. Maxedon, Sr.</name>
      <url>https://github.com/edadma</url>
    </developer>
  </developers>
