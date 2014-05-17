package il.ac.shenkar.hello

import scala.io.Source
import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/17/14
 * Time: 2:20 PM
 *
 *
 * Gets a file nme as an argument to main and print it to screen
 */
object FileReader
{
  def main(args: scala.Array[String])
  {
      if (args.length < 1)
      {
        println("You are in here: " + new File(".").getAbsolutePath())
        println("Please enter a file path as an argument to main")
        sys.exit(1)
      }
      else
      {

          val lines = Source.fromFile(args(0)).getLines()
          for (line <- lines)
          {
            println(line)
          }
      }
  }
}
