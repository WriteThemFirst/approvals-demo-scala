package com.demo.folder

import java.nio.file.Paths

import com.github.writethemfirst.Approbation
import org.scalatest.fixture
import org.scalatest.flatspec
import org.scalatest.matchers.should.Matchers

class FolderContentTest extends flatspec.FixtureAnyFlatSpec with Approbation with Matchers  {
  "folder content" should "be the same" in { approver =>
    approver.verify(Paths.get("src/test/resources/com/demo/folder.Feature__demo.json.actual"))
  }
}
