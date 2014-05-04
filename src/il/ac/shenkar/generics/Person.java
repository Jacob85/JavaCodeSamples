package il.ac.shenkar.generics;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/4/14
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person
{
    private String firstName;
    private String lastName;
    private double age;

    public Person(String firstName, String lastName, double age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person()
    {
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public double getAge()
    {
        return age;
    }

    public void setAge(double age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
