package il.ac.shenkar;

import il.ac.shenkar.point.My3DPoint;
import il.ac.shenkar.point.MyPoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yakia
 * Date: 3/11/14
 * Time: 1:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main
{
    public static void main (String[] srgs)
    {
        MyPoint point = new MyPoint(2,4);
        MyPoint point1 = new My3DPoint(1,5,4);

        ArrayList<MyPoint> myPoints = new ArrayList<MyPoint>();
        myPoints.add(point);
        myPoints.add(point1);

        printList(myPoints);

        Collections.sort(myPoints);

        System.out.println("Sorting the List...");
        printList(myPoints);


    }


    // Good Example of Generic
    public static void printList (List<?> toPrint)
    {
        for (Object ob : toPrint)
        {
            System.out.println(ob);
        }
    }

    public static void readShapes(List<Shape> readTo)
    {
        if (readTo == null)
            readTo = new ArrayList<Shape>();

        for (int i=1 ; i< 11 ; i++)
        {
            readTo.add(new Rectangle(new MyPoint(Math.random()*i, Math.random()*i),
                                    new MyPoint(Math.random()*i, Math.random()*i),
                                    new MyPoint(Math.random()*i, Math.random()*i),
                                    new MyPoint(Math.random()*i, Math.random()*i)));
        }

    }


}
