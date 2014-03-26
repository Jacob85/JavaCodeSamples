package il.ac.shenkar.threads;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 3/26/14
 * Time: 8:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Consumer extends Thread
{

    Producer producer;

    Consumer(Producer p)
    {
        producer = p;
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                String message = producer.getMessage();
                System.out.println("Got message: " + message + " messages size (" + producer.getMesegesSize() + ")");
                //sleep(200);
            }
        } catch (InterruptedException e)
        {
            System.out.println(this.getClass().getSimpleName() + " was interrupted: " + e.getMessage());
        }
    }
}
