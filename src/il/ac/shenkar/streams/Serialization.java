package il.ac.shenkar.streams;

import il.ac.shenkar.Triangle;
import il.ac.shenkar.point.MyPoint;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 4/1/14
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Serialization
{
    public static void main(String[] args)
    {
        // Added "implements Serializable" to the Triangle class and MyPoint class

        Serializable triangle = new Triangle(new MyPoint(1,2),
                                         new MyPoint(2,3),
                                         new MyPoint(3,4));
        // writing the triangle to the file
        writeToFile(triangle);

        //read from file
        Triangle read = (Triangle) readfromFile();

        System.out.println(read);

        ArrayList<Serializable> serializableArrayList = new ArrayList<Serializable>();
        serializableArrayList.add(createRandomTriangle());
        serializableArrayList.add(createRandomTriangle());
        serializableArrayList.add(createRandomTriangle());
        serializableArrayList.add(createRandomTriangle());
        serializableArrayList.add(createRandomTriangle());
        serializableArrayList.add(createRandomTriangle());
        serializableArrayList.add(createRandomTriangle());
        serializableArrayList.add(createRandomTriangle());
        serializableArrayList.add(createRandomTriangle());
        serializableArrayList.add(createRandomTriangle());

        writeToFile(serializableArrayList);
        printList(readList());


    }
    // Good Example of Generic
    public static void printList (List<?> toPrint)
    {
        for (Object ob : toPrint)
        {
            System.out.println(ob);
        }
    }
    private static Triangle createRandomTriangle()
    {
        int random = 10;
        return new Triangle(new MyPoint(Math.random()* random,Math.random()*random),
                new MyPoint(Math.random()* random,Math.random()*random),
                new MyPoint(Math.random()* random,Math.random()*random));
    }
    private static Serializable readfromFile()
    {
        Triangle readTriangle = null;
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try
        {
            fin = new FileInputStream("triangle.ser");
            ois = new ObjectInputStream(fin);
            readTriangle = (Triangle) ois.readObject();
            ois.close();

            return readTriangle;

        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
        finally
        {
            if (fin != null)
            {
                try
                {
                    fin.close();
                } catch (IOException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
            if (ois != null)
            {
                try
                {
                    ois.close();
                } catch (IOException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }
    }

    private static ArrayList<Triangle> readList()
    {
        ArrayList<Triangle> torturn = null;
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        try
        {
            fin = new FileInputStream("triangle.ser");
            ois = new ObjectInputStream(fin);
            torturn = (ArrayList<Triangle>) ois.readObject();
            ois.close();

            return torturn;

        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
        finally
        {
            if (fin != null)
            {
                try
                {
                    fin.close();
                } catch (IOException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
            if (ois != null)
            {
                try
                {
                    ois.close();
                } catch (IOException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }
    }

    private static void writeToFile(Serializable serializable)
    {
        FileOutputStream fout = null;
        ObjectOutputStream oos =null;
        try
        {
            fout = new FileOutputStream("triangle.ser");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(serializable);
            oos.close();
            System.out.println("Done");
        } catch (IOException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        finally
        {
            if (fout != null)
            {
                try
                {
                    fout.close();
                } catch (IOException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
            if( oos != null)
            {
                try
                {
                    oos.close();
                } catch (IOException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }
    }
}
