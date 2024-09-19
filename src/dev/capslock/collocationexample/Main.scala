package dev.capslock.collocationexample

@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  println(s"fibonacci(22) = ${util.Fib.fibonacci(22)}")

def msg = "I was compiled by Scala 3. :)"
