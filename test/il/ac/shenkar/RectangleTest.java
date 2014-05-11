package il.ac.shenkar;

import il.ac.shenkar.point.MyPoint;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/11/14
 * Time: 11:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class RectangleTest
{
    @Test
    public void testCalcPerimeter() throws Exception
    {
        Rectangle rectangle = new Rectangle(new MyPoint(2, 4), new MyPoint(3 ,6),
                                            new MyPoint(3, 4), new MyPoint(4, 5));
        double perimeter = rectangle.calcPerimeter();
        Assert.assertTrue(perimeter != 0);

        Rectangle rectangle1 = new Rectangle(new MyPoint(0,0), new MyPoint(0,0),
                                             new MyPoint(0,0), new MyPoint(0,0));

        Assert.assertEquals(0, rectangle1.calcPerimeter());


    }

    @Test
    public void testEquals() throws Exception
    {
        Rectangle rectangle1 = new Rectangle(new MyPoint(2, 4), new MyPoint(3 ,6),
                new MyPoint(3, 4), new MyPoint(4, 5));
        Rectangle rectangle2 = new Rectangle(new MyPoint(2, 4), new MyPoint(3 ,6),
                new MyPoint(3, 4), new MyPoint(4, 5));
        Assert.assertTrue(rectangle1.equals(rectangle2));


        Rectangle rectangle3 = new Rectangle(new MyPoint(0,0), new MyPoint(0,0),
                new MyPoint(0,0), new MyPoint(0,0));
        Assert.assertTrue(!rectangle1.equals(rectangle3));
        Assert.assertTrue(!rectangle2.equals(rectangle3));

    }

}
