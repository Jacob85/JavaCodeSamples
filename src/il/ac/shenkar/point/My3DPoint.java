package il.ac.shenkar.point;

/**
 * Created with IntelliJ IDEA.
 * User: yakia
 * Date: 3/11/14
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class My3DPoint extends MyPoint
{
    private double zVal;


    public My3DPoint(double xVal, double yVal, double zVal)
    {
        super(xVal, yVal);
        this.zVal = zVal;
    }

    public double getzVal()
    {
        return zVal;
    }

    public void setzVal(double zVal)
    {
        this.zVal = zVal;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("My3DPoint: (");
        builder.append(this.getxVal());
        builder.append(", " + this.getyVal());
        builder.append(", " + this.getzVal());
        builder.append(")");
        return builder.toString();
    }


}
