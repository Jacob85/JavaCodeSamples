package ac.il.shenkar.enums;

/**
 * Created with IntelliJ IDEA.
 * User: yakia
 * Date: 3/17/14
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
// Enum type with constant-specific class bodies and data
public enum Operation
{
    PLUS("+")
    {
        double apply(double x, double y)
        {
            return x + y;
        }
    },
    MINUS("-")
    {
        double apply(double x, double y)
        {
            return x - y;
        }
    },
    TIMES("*")
    {
        double apply(double x, double y)
        {
            return x * y;
        }
    },
    DIVIDE("/")
    {
        double apply(double x, double y)
        {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol)
    {
        this.symbol = symbol;
    }

    @Override public String toString()
    {
        return symbol;
    }

    abstract double apply(double x, double y);
}