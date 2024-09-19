package dev.capslock.collocationexample.util

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

// file with .test.scala extension are test sources
class FibSpec extends AnyFlatSpec, Matchers:
  "fib" should "return 0 for 0" in:
    Fib.fibonacci(0) shouldEqual 0

  it should "return 1 for 1" in:
    Fib.fibonacci(1) shouldEqual 1

  it should "return 1 for 2" in:
    Fib.fibonacci(2) shouldEqual 1

  it should "return 17711 for 22" in:
    Fib.fibonacci(22) shouldEqual 17711

  it should "throw IllegalArgumentException for negative numbers" in:
    an[IllegalArgumentException] should be thrownBy:
      Fib.fibonacci(-1)
