package il.ac.shenkar.classes

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/17/14
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
class Student(nam: String, ident: String)  /*Class parameter - will be used for the default constructor*/
{
  /*this code will be taken into the ctor*/
  println("We are creating new Student for name " +nam )

  /* private members*/
  private var name: String = nam
  private var id : String = ident

  /* methods*/
  def print()= "ID: " + id + " Name: " + name
  def getName () = name
  def setName(str:String) = name = str
  def getId() = id
  def setId(str: String) = id = str

  /*Constructors*/
  def this() = this("default Name", "0000000")


  /*if we want to define a singleton object we must use Object instead of class*/

  override def toString() :String = print()
}
