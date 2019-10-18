package com.demo.folder

import java.nio.file.Paths

import com.github.writethemfirst.Approbation
import org.scalatest.{Matchers, fixture}

class FolderContentTest extends fixture.FlatSpec with Approbation with Matchers  {
  "folder content" should "be the same" in { approver =>
    approver.verify(Paths.get("src/test/resources/com/demo/folder.Feature__demo.json.actual"))
  }
}
