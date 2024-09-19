package dev.capslock.collocationexample.util

object Fib:
  def fibonacci(n: Int): Int =
    if n < 0 then throw IllegalArgumentException("n must be non-negative")
    if n <= 1 then n
    else fibonacci(n - 1) + fibonacci(n - 2)
