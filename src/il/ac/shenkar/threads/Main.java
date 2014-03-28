package il.ac.shenkar.threads;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 3/23/14
 * Time: 7:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main
{
    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            System.out.println("Number of Argument " + args.length +" is smaller than 2!  Exiting!!");
            System.exit(0);
        }

        PrintJob printJob1 = new PrintJob(args[0]);
        PrintJob printJob2 = new PrintJob(args[1]);

        Thread thread1 = new Thread(printJob1);
        Thread thread2 = new Thread(printJob2);

/*
        // simple thread Example
        thread1.start();
        thread2.start();
        try
        {
            Thread.sleep(100);
        } catch (InterruptedException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("Main in Running...");
*/


/*
        // join example
        try
        {
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();

        } catch (InterruptedException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("Main is running ...");
        System.out.println("Main is running ...");
        System.out.println("Main is running ...");
        System.out.println("Main is running ...");
        System.out.println("Main is running ...");
        System.out.println("Main is running ...");
        System.out.println("Main is running ...");
        System.out.println("Main is running ...");
        System.out.println("Main is running ...");
        System.out.println("Main is running ...");

*/


       //Producer Consumer Code
        Producer producer = new Producer();
        producer.start();
        new Consumer(producer).start();
    }
}
