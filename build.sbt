name := "seiyuu"

scalaVersion := "2.11.8"

//libraryDependencies += "junit" % "junit" % "4.12"

//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

//libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.2" % "test"

libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.3.0"

libraryDependencies += "net.ruippeixotog" %% "scala-scraper" % "1.2.0"

initialCommands in console := 
  """import net.ruippeixotog.scalascraper.browser._
    |import net.ruippeixotog.scalascraper.dsl.DSL._
    |import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
    |import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
    |import better.files.File""".stripMargin