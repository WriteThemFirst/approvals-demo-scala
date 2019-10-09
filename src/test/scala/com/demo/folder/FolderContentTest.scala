package com.demo.folder

import java.nio.file.Paths

import com.github.writethemfirst.Approbation

class FolderContentTest extends Approbation {
  "folder content" should "be the same" in { approver =>
    approver.verify(Paths.get("src/test/resources/com/demo/folder.Feature__demo.json.actual"))
  }
}
