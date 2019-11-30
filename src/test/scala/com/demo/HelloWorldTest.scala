package com.demo

import com.github.writethemfirst.Approbation
import org.scalatest.fixture
import org.scalatest.flatspec
import org.scalatest.matchers.should.Matchers

class HelloWorldTest extends flatspec.FixtureAnyFlatSpec with Approbation with Matchers {
  "greeter" should "greet" in { approver =>
    val result = HelloWorld.greet("world")
    approver.verify(result)
  }
}
