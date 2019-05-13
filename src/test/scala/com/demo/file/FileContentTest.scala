package com.demo.file

import java.nio.file.Files._

import com.demo.Approbation

class FileContentTest extends Approbation {
  "file content" should "be the same" in { approver =>
    val tempFolder = createTempDirectory("test")
    val tempFile   = createFile(tempFolder.resolve("file.txt"))
    write(tempFile, "file contents".getBytes)
    approver.verify(tempFile)
  }
}
