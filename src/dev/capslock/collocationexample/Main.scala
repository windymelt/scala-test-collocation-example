package dev.capslock.collocationexample

import pureconfig._
import pureconfig.generic.derivation.default._

case class Config(canwereadconfig: Boolean = false) derives ConfigReader

@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  println(s"fibonacci(22) = ${util.Fib.fibonacci(22)}")
  val conf = ConfigSource.default.loadOrThrow[Config]
  println(s"canwereadconfig = ${conf.canwereadconfig}")

def msg = "I was compiled by Scala 3. :)"
