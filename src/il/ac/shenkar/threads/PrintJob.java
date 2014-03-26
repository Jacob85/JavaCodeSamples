package il.ac.shenkar.threads;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 3/23/14
 * Time: 7:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintJob implements Runnable
{
    private String name;

    public PrintJob(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        for (int i=0; i<40 ; i++)
        {
            System.out.println(name + " is Running...");
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }
}
