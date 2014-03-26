package il.ac.shenkar.innerclass;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 3/23/14
 * Time: 6:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main
{
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();
        linkedList.add(15);
        linkedList.add("String");
        linkedList.add(true);
        linkedList.add(3.3);


        System.out.println(linkedList.toString());

    }
}
