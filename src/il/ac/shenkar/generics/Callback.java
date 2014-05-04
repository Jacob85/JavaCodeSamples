package il.ac.shenkar.generics;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/4/14
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Callback<T>
{
    public void done(T retObject, Exception e);
}
