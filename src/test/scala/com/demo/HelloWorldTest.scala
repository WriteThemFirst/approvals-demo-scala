package com.demo

class HelloWorldTest extends Approbation {
  "greeter" should "greet" in { approver =>
    val result = HelloWorld.greet("world")
    approver.verify(result)
  }

  "list" should "have nice representation" in { approver =>
    val representation = prettify(List.tabulate(5, 7)((_, _)))
    approver.verify(representation)
  }

}
