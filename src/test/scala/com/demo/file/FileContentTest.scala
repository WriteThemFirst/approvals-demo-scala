package com.demo.file

import java.nio.file.Files._

import com.github.writethemfirst.Approbation
import org.scalatest.{Matchers, fixture}

class FileContentTest extends fixture.FlatSpec with Approbation with Matchers {
  "file content" should "be the same" in { approver =>
    val tempFolder = createTempDirectory("test")
    val tempFile = createFile(tempFolder.resolve("file.txt"))
    write(tempFile, "file contents".getBytes)
    approver.verify(tempFile)
  }
}
