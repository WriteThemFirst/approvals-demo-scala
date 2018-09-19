package com.demo

import com.github.writethemfirst.approvals.approvers.Approver

trait Approbation {
  private val approvals = (new Approver).testing(getClass)

  def verify(fileName: String,actualOutput: Any): Unit =
      approvals.writeTo(fileName).verify(actualOutput)
}
