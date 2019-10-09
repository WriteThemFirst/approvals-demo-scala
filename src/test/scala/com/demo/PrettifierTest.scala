package com.demo

import com.github.writethemfirst.Approbation

class PrettifierTest extends Approbation {
  "list" should "have nice representation" in { approver =>
    val representation = prettify(List.tabulate(5, 8)((_, _)))
    approver.verify(representation)
  }
}
