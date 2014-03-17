package il.ac.shenkar;

import il.ac.shenkar.point.MyPoint;

/**
 * Created with IntelliJ IDEA.
 * User: yakia
 * Date: 3/11/14
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Triangle extends Shape
{
    private MyPoint p3;
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(MyPoint p1, MyPoint p2, MyPoint p3)
    {
        super(p1, p2);
        this.p3 = p3;
        calcSides();
    }

    public MyPoint getP3()
    {
        return p3;
    }

    public void setP3(MyPoint p3)
    {
        this.p3 = p3;
    }


    private void calcSides()
    {
       sideA = findDistance(this.getP1(), this.getP2());
       sideB = findDistance(this.getP2(), this.getP3());
       sideC = findDistance(this.getP3(), this.getP1());
    }


    @Override
    public double calcPerimeter()
    {
        return sideA + sideB + sideC;
    }


}
