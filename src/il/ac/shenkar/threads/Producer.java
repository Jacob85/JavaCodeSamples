package il.ac.shenkar.threads;


import java.util.Vector;


/**
 * Created with IntelliJ IDEA.
 * User: yakia
 * Date: 3/25/14
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Producer extends Thread
{
    static final int MAXQUEUE = 5;
    private Vector messages = new Vector();

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                putMessage();
                //sleep(5000);
            }
        } catch (InterruptedException e)
        {
            System.out.println(this.getClass().getSimpleName() + " was interrupted: " + e.getMessage());
        }
    }

    public synchronized void putMessage() throws InterruptedException
    {
        while (messages.size() == MAXQUEUE)
        {
            wait();
        }
        messages.addElement(new java.util.Date().toString());
        System.out.println("put message... messages size (" + messages.size() + ")");
        notify();
        //Later, when the necessary event happens, the thread that is running it calls notify() from a block synchronized on the same object.
    }

    // Called by Consumer
    public synchronized String getMessage() throws InterruptedException
    {
        notify();
        while (messages.size() == 0)
        {
            wait();     //By executing wait() from a synchronized block, a thread gives up its hold on the lock and goes to sleep.
        }
        String message = (String) messages.firstElement();
        messages.removeElement(message);
        return message;
    }

    public int getMesegesSize()
    {
        return messages.size();
    }

}
