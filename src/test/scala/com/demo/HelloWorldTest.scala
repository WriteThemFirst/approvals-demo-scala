package com.demo

import com.github.writethemfirst.Approbation

class HelloWorldTest extends Approbation {
  "greeter" should "greet" in { approver =>
    val result = HelloWorld.greet("world")
    approver.verify(result)
  }
}
