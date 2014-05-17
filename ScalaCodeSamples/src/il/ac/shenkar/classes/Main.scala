package il.ac.shenkar.classes

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/17/14
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
object Main
{
  def main(args: scala.Array[String])
  {
    /* Simple class demo*/
    val student = new Student("Haim", "23232323");
    println(student.getName())

    /*Operators demo*/
    val a = new Circle(2)
    println(a)
    val b = new Circle(3)
    println(b)
    val c = a+b
    println(c)

    /*Expressions*/

    for (i <- 1 to 10)
    {
      println("i = " + i)
    }

    /* filtering a loop*/
    val vec = Array(1,2,3,4,5,6,7,8,9,10)
    for(i<- vec if(i%2 == 0 )) /*print only 2,4,6,8,10*/
    {
      println("i="+i)
    }

    val vector = Array(1,2,3,4,5,6,7,8,9,10)
    val powerVector = for (num <- vector)
                      yield math.pow(num, num)
   powerVector.foreach(println)


    /* Match sample*/
    val name = "Alon"
    name match
    {
      case "alon" => println("hi alon");
      case "Alon" => println("hi Alon")
    }

  }

}
