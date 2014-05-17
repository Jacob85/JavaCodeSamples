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

    /* ::: sample*/
    val list1 = List(10,20,30)
    val list2 = List(40,50,60)
    val list3 = list1 ::: list2   /* ::: concat list 1 to list 2*/
    list3.foreach(println)

    /* :: sample*/
    val list4 =  13 :: list3
    println("the new list with 13...")
    list4.foreach(println)

    /* Tuples  - constant data structure which can hold different data types*/
    val ob = (123, "hello", 1.2, true)
    println(ob)
    if (ob._4)     /* access the tuple fields*/
      println(ob._4)



    /* Maps*/
    var myMap = Map[String, Int]()
    myMap += ("Hello" -> 12)
    myMap += ("hi" -> 13)
    println("My Map: " + myMap)


    /* Blocks*/
    def func (num: Int) = num*num + num
    val number =
    {
      val a = func(1)
      val b = func(4)
      a+b
    }
    println(number)
  }


  def sum(numA: Int, numB: Int, numC: Int): Int =
  {
    var sum: Int = numA + numB + numC
    sum
  }

  def shorterSum (numA: Int, numB: Int, numC: Int) = numA + numB + numC;
}
