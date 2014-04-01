package il.ac.shenkar.streams;

import java.io.*;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 4/1/14
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class UrlSample
{
    /**
     * in order to run this code sample provide 2 parameters to main
     * param 1 = URL to get file from
     * param 2 = file name to save the file in
     * @param args
     */
    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            System.out.println("Number of Argument " + args.length +" is smaller than 2!  Exiting!!");
            System.exit(0);
        }

        URL url = null;
        InputStream inputStream = null;
        FileWriter fileWriter = null;
        try
        {
            url = new URL(args[0]);     /*args[0] is the url*/
            // open the input stream and connect it into other streams for easy reading
            inputStream = url.openStream();
            InputStreamReader bufferedInputStream = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(bufferedInputStream);
            System.out.println("Open connection to: " + args[0]);


            fileWriter = new FileWriter(args[1]);  /*args[1] is the file name */
            System.out.println("Open file: " + args[1]);

            System.out.println("starting to write into file....");
            String line = bufferedReader.readLine();
            while (line != null)
            {
                fileWriter.write(line);
                line = bufferedReader.readLine();
            }
            System.out.println("Finished write to file!");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Closing resources...");
            // close resources
            if (fileWriter != null)
            {
                try
                {
                    fileWriter.close();
                } catch (IOException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
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
            System.out.println("Resources closed...");
        }
    }
}
