package il.ac.shenkar.generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/4/14
 * Time: 11:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebObject implements IWebObject
{
    @Override
    public void getFromWeb(URL getFileFrom, Callback<String> callback)
    {
        InputStream inputStream = null;
        StringBuilder stringBuilder = new StringBuilder();
        try
        {
            inputStream = getFileFrom.openStream();
            InputStreamReader bufferedInputStream = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(bufferedInputStream);
            System.out.println("Open connection to: " +getFileFrom);



            String line = bufferedReader.readLine();
            while (line != null)
            {
                stringBuilder.append(line);
                line = bufferedReader.readLine();
            }

            System.out.println("Finished reading the html file to String");
            System.out.println("String read is: " + stringBuilder.toString());
        } catch (IOException e)
        {
            callback.done(null, e);
        }
        finally
        {
            //close resources
            if (inputStream != null)
            {
                try
                {
                    inputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }

        // callback to the user
        callback.done(stringBuilder.toString(), null);

    }
}
