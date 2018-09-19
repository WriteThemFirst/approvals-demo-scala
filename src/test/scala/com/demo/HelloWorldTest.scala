package com.demo
import org.scalatest.{FlatSpec, Matchers}

class HelloWorldTest extends FlatSpec with Matchers with Approbation {
  "greeter" should "greet" in {
    val result = HelloWorld.greet("world")
    verify("greeter_greets", result)
  }
}
