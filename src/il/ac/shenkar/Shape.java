package il.ac.shenkar;

import il.ac.shenkar.point.MyPoint;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: yakia
 * Date: 3/11/14
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Shape implements Serializable
{
    private MyPoint p1;
    private MyPoint p2;

    protected Shape(MyPoint p1, MyPoint p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public MyPoint getP1()
    {
        return p1;
    }

    public void setP1(MyPoint p1)
    {
        this.p1 = p1;
    }

    public MyPoint getP2()
    {
        return p2;
    }

    public void setP2(MyPoint p2)
    {
        this.p2 = p2;
    }

    public abstract double calcPerimeter();


    protected double findDistance(MyPoint p1, MyPoint p2)
    {
        return Math.sqrt( Math.pow(p1.getxVal() - p2.getxVal(),2) + Math.pow(p1.getyVal() - p2.getyVal(),2));
    }
}
