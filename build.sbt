lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

resolvers += 
"Artifactory" at "http://localhost:8081/artifactory/sbt-dev/"

publishTo := Some("Artifactory Realm" at "http://localhost:8081/artifactory/sbt-dev;build.timestamp=" + new java.util.Date().getTime)
credentials += Credentials("Artifactory Realm", "localhost", "admin", "APcXriD77ZygR9Nzv3UUuLnwJ7")

  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
