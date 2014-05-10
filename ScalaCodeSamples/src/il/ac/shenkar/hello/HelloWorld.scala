package il.ac.shenkar.hello

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/10/14
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */
object HelloWorld
{
  def main(args: scala.Array[String])
  {
    //print a simple String
    println("hello World!")

    // use a predefine function
    val total = sum(10,20,30);
    println("total sum = " + total);

    println("Here We used the Shorter Sum: "+ shorterSum(10,20,30));


    //for each
    println()
    args.foreach(str => println(str));
    println()
    args.foreach(println);

    //Arrays
    var vec = new Array[String](4);
    vec(0) = "Moran"
    vec(1) = "Avi"
    vec(2) = "Chen"
    vec(3) = "Idan"

    for (strTmp <- vec)
    {
      println(strTmp)
    }

    println("Sorting....")
    vec = vec.sortBy(x => x.length )
    vec.foreach(println)


  }


  def sum(numA: Int, numB: Int, numC: Int): Int =
  {
    var sum: Int = numA + numB + numC
    sum
  }

  def shorterSum (numA: Int, numB: Int, numC: Int) = numA + numB + numC;
}
