package il.ac.shenkar.generics;

import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/4/14
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IWebObject
{
    public void getFromWeb(URL getFileFrom, Callback<String> fileAsString);

}
