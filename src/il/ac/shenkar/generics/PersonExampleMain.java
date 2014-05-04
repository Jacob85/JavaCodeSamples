package il.ac.shenkar.generics;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/4/14
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonExampleMain
{
    public static void main (String[] args )
    {
        Person avi = new Person("Avi", "Cohen", 33);
        Person moran = new Person("Moran", "Levy", 18);
        Person moshe = new Person("Moshe", "Luria", 22);
        Person yoav = new Person("yoav", "melamed", 24);

        List<Person> persons = new ArrayList<Person>();
        persons.add(moran);
        persons.add(moshe);
        persons.add(yoav);
        persons.add(avi);

        System.out.println("Printing collection without sorting...");
        printList(persons);

        //sort by first name
        Collections.sort(persons, new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return  o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        System.out.println("\nPrinting collection after sorted by first name...");
        printList(persons);


        //sort by last name
        Collections.sort(persons, new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return  o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println("\nPrinting collection after sorted by last name...");
        printList(persons);

        //sort by first age
        Collections.sort(persons, new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return o1.getAge() > o2.getAge() ? 1 : o1.getAge() < o2.getAge() ? -1 : 0;
            }
        });

        System.out.println("\nPrinting collection after sorted by age...");
        printList(persons);
    }

    // Good Example of Generic
    public static void printList (List<?> toPrint)
    {
        for (Object ob : toPrint)
        {
            System.out.println(ob);
        }
    }
}
