package com.demo

import com.github.writethemfirst.Approbation
import org.scalatest.{Matchers, fixture}

class HelloWorldTest extends fixture.FlatSpec with Approbation with Matchers {
  "greeter" should "greet" in { approver =>
    val result = HelloWorld.greet("world")
    approver.verify(result)
  }
}
