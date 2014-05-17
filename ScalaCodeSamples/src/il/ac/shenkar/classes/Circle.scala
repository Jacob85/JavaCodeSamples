package il.ac.shenkar.classes

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/17/14
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
class Circle (rad: Double)
{
  require(rad>0, "Please make sure to enter radus > 0 Thanks :)")
  private var radius = rad
  def area() = scala.math.Pi * scala.math.pow(radius, radius)
  override def toString() = "Radius: " + radius + " Area: " + area()
  def + (ob: Circle) = new Circle(this.radius + ob.radius);
}
