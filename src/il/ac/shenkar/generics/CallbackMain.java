package il.ac.shenkar.generics;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/4/14
 * Time: 11:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class CallbackMain
{
    public static void main(String [] args)
    {

        WebObject webObject = new WebObject();
        try
        {
            webObject.getFromWeb(new URL("http://google.com"), new Callback<String>()
            {
                @Override
                public void done(String retObject, Exception e)
                {
                    System.out.println("We are now in the callback function");
                    //once the method id done the code will return to here
                    if (e == null)
                        System.out.println("Exception param is null");
                    else
                        System.out.println("Exception param is not null: " + e.getMessage());;

                    System.out.println("String returned is: " + retObject);
                }
            });
        } catch (MalformedURLException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
