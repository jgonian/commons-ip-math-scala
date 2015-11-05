import sbt._

object Dependencies {

  val commonsIpMath     =   "net.ripe.commons"  %   "commons-ip-math" % "1.21.1"
  val scalaTest         =   "org.scalatest"     %%  "scalatest"       % "2.2.4"   % Test

  val mainDependencies = Seq(commonsIpMath)

  val testDependencies = Seq(scalaTest)
}