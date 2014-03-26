package il.ac.shenkar.enums;

import il.ac.shenkar.innerclass.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: yakia
 * Date: 3/17/14
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main
{
    public static void main(String[] args)
    {

        for (Planet p : Planet.values())
        {
            // use the mass i extracted before to calculate any Planet weight using the mass
            System.out.printf("Weight on %s is %.1f%n", p, p.surfaceWeight(p.mass()));
            // %s = String
            // %.1f = print float with one number only behind the .
            // %n - new line
        }

        for (Planet p : Planet.values())
            System.out.println(p);


        double x = 10;
        double y = 8;
        for (Operation op : Operation.values())
            System.out.printf("%.1f %s %.1f = %.1f%n",x, op, y, op.apply(x, y));

    }
}
