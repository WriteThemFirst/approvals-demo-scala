package com.demo

import com.github.writethemfirst.Approbation
import org.scalatest.flatspec.FixtureAnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloWorldTest extends FixtureAnyFlatSpec with Approbation with Matchers {
  "greeter" should "greet" in { approver =>
    val result = HelloWorld.greet("world")
    approver.verify(result)
  }
}
