import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._


object Dependencies {
  // Library Versions
  val catsVersion       = "2.2.0"
  val catsEffectVersion = "2.3.1"

  val magnoliaVersion = "0.17.0"

  val monixVersion = "3.3.0"

  val batikVersion = "1.14"

  val miniTestVersion   = "2.9.2"
  val scalaCheckVersion = "1.14.0"
  val munitVersion      = "0.7.21"

  // Libraries
  val catsEffect = Def.setting("org.typelevel" %%% "cats-effect" % catsEffectVersion)
  val catsCore   = Def.setting("org.typelevel" %%% "cats-core"   % catsVersion)
  val catsFree   = Def.setting("org.typelevel" %%% "cats-free"   % catsVersion)

  val monix = Def.setting("io.monix" %%% "monix" % monixVersion)

  val batik = Def.setting("org.apache.xmlgraphics" % "batik-transcoder" % batikVersion)

  val miniTest     = Def.setting("io.monix"     %%% "minitest"      % miniTestVersion % "test")
  val miniTestLaws = Def.setting("io.monix"     %%% "minitest-laws" % miniTestVersion % "test")
  val munit        = Def.setting("org.scalameta" %% "munit"         % munitVersion % "test")

  val magnolia = Def.setting("com.propensive" %%% "magnolia" % magnoliaVersion)

  val scalaTags = Def.setting("com.lihaoyi" %%% "scalatags" % "0.9.3")
}
