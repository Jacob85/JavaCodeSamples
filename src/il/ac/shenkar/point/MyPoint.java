package il.ac.shenkar.point;

/**
 * Created with IntelliJ IDEA.
 * User: yakia
 * Date: 3/11/14
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyPoint implements Comparable<MyPoint>
{
    private double xVal;
    private double yVal;

    public MyPoint(double xVal, double yVal)
    {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public double getxVal()
    {
        return xVal;
    }

    public void setxVal(double xVal)
    {
        this.xVal = xVal;
    }

    public double getyVal()
    {
        return yVal;
    }

    public void setyVal(double yVal)
    {
        this.yVal = yVal;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("MyPoint: (");
        builder.append(this.getxVal());
        builder.append(", " + this.getyVal());
        builder.append(")");
        return builder.toString();
    }

    @Override
    public int compareTo(MyPoint compareTo)
    {
        // return values
        int lessThan = -1;
        int equels = 0;
        int graterThan =1;

        // my comparing algorithm is sorting by the xVal;

        if (this.getxVal() > compareTo.getxVal())
        {
            return graterThan;
        }
        else if (this.getxVal() < compareTo.getxVal())
        {
            return lessThan;
        }
        return equels;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof MyPoint)
        {
            MyPoint tmp = (MyPoint) obj;
            return (this.getxVal() == tmp.getxVal() && this.getyVal() == tmp.getyVal());
        }
        return false;
    }
}
