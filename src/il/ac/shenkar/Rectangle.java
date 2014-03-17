package il.ac.shenkar;

import il.ac.shenkar.point.MyPoint;

/**
 * Created with IntelliJ IDEA.
 * User: yakia
 * Date: 3/11/14
 * Time: 4:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle extends Shape
{
    private MyPoint p3;
    private MyPoint p4;

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Rectangle(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4)
    {
        super(p1, p2);
        this.p3 = p3;
        this.p4 = p4;

    }

    public MyPoint getP3()
    {
        return p3;
    }

    public void setP3(MyPoint p3)
    {
        this.p3 = p3;
    }

    public MyPoint getP4()
    {
        return p4;
    }

    public void setP4(MyPoint p4)
    {
        this.p4 = p4;
    }

    private void calcSides()
    {
        sideA = findDistance(this.getP1(), this.getP2());
        sideB = findDistance(this.getP2(), this.getP3());
        sideC = findDistance(this.getP3(), this.getP4());
        sideD = findDistance(this.getP4(), this.getP1());
    }

    @Override
    public double calcPerimeter()
    {
        return sideA + sideB + sideC + sideD;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Rectangle)
        {
            Rectangle tmp = (Rectangle) obj;
            if (this.getP1().equals(tmp.getP1()) &&
                    this.getP2().equals(tmp.getP2()) &&
                    this.getP3().equals(tmp.getP3()) &&
                    this.getP4().equals(tmp.getP4()))
            {
                return true;
            }
        }
        return false;
    }
}
