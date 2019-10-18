package com.demo

import com.github.writethemfirst.Approbation
import org.scalatest.{Matchers, fixture}

class PrettifierTest extends fixture.FlatSpec with Approbation with Matchers {
  "list" should "have nice representation" in { approver =>
    val representation = prettify(List.tabulate(5, 8)((_, _)))
    approver.verify(representation)
  }
}
