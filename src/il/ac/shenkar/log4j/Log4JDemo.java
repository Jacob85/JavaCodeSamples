package il.ac.shenkar.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/11/14
 * Time: 10:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Log4JDemo
{
    private static Logger logger = Logger.getLogger(Log4JDemo.class);

    public static void main(String args[])
    {
        PropertyConfigurator.configure(".\\conf\\log4j.properties");
        logger.info("This is a demo info message");

        //this code is for creating a null pointer Exception
        try
        {
            String nullString = null;
            nullString.toCharArray();
        }
        catch (NullPointerException e)
        {
            logger.error("Something went wrong (" + e.getMessage() + ")...", e);
        }

        for (int i =0; i < 10 ; i++)
        {
            logger.debug("i now is: " + i);
        }

    }
}
