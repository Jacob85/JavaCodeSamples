package il.ac.shenkar.reflection;

import il.ac.shenkar.Rectangle;
import il.ac.shenkar.point.MyPoint;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/10/14
 * Time: 11:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReflectionDemo
{

    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle(new MyPoint(2,4), new MyPoint(4,6), new MyPoint(2,4) ,new MyPoint(4,8));
        Class aClass = rec.getClass();
        Field[] recFields = aClass.getDeclaredFields();
        Method[] recMethods =  aClass.getDeclaredMethods();

        System.out.println("Class Fields");
        for (Field currField : recFields)
        {
            System.out.println(currField.getName());
        }

        System.out.println("Class Methods");
        for (Method method : recMethods)
        {
            System.out.println(method.getName());
        }


        Class recSuperClass = aClass.getSuperclass();
        if (recSuperClass == null)
        {
            System.out.println(String.format("The class %s dose not have a super class", aClass.getSimpleName()));
        }
        else
        {
            System.out.println("the super class name is: " + recSuperClass.getSimpleName());
            System.out.println("Look for constructors");
            Constructor[] constructors = recSuperClass.getConstructors();
            for (Constructor constructor: constructors)
            {
                System.out.println("Ctor name: " + constructor.getName());
            }

            System.out.println("The class " + recSuperClass.getSimpleName() + "" +
                    "is from package " + recSuperClass.getPackage());
        }

        try
        {
            Class anotherClass = Class.forName("il.ac.shenkar.point.MyPoint");
            Constructor [] constructors = anotherClass.getConstructors();

            System.out.println("Constructors for: " + anotherClass.getSimpleName());
            for (Constructor constructor: constructors)
            {
                System.out.println(constructor);
            }
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }
}
