package com.demo

import com.github.writethemfirst.Approbation
import org.scalatest.fixture
import org.scalatest.flatspec
import org.scalatest.matchers.should.Matchers

class PrettifierTest extends flatspec.FixtureAnyFlatSpec with Approbation with Matchers {
  "list" should "have nice representation" in { approver =>
    val representation = prettify(List.tabulate(5, 8)((_, _)))
    approver.verify(representation)
  }
}
