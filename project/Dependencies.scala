import sbt._

object Dependencies {

  val commonsIpMath     =   "com.github.jgonian"  %   "commons-ip-math" % "1.30"
  val scalaTest         =   "org.scalatest"       %%  "scalatest"       % "2.2.4"   % Test

  val mainDependencies = Seq(commonsIpMath)

  val testDependencies = Seq(scalaTest)
}
