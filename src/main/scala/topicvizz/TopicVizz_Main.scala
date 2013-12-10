package topicvizz

import java.io._

import topicvizz.core.TopicVizz_Parser

object TopicVizz_Main {

  /**
   * @param args
   */
  def main(args: Array[String]) {

    try {
      // Read working directory
      val userDir = new File(System.getProperty("user.dir"))
      // Read pdf directory
      val pdfDir = new File(userDir + "\\src\\main\\resources\\pdfs\\")
      System.out.println("Directory: " + pdfDir)
      // Initialize parser and parse directory
      val parser = new TopicVizz_Parser()
      parser.parseDirectory(userDir + "\\src\\main\\resources\\pdfs\\")

    } catch {
      case e: Exception => System.out.println(e.getMessage())
    }

  }

}
