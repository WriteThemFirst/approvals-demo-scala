package com.demo

class HelloWorldTest extends Approbation {
  "greeter" should "greet" in { approver =>
    val result = HelloWorld.greet("world")
    approver.verify(result)
  }
}
