package il.ac.shenkar;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 5/27/14
 * Time: 9:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class XmlParser
{
    public static void main(String[] args)
    {
        URL url = null;				// create url Object
        InputStream is = null;
        HttpURLConnection connection = null;
        try
        {
            url = new URL("http://www.bankisrael.gov.il/currency.xml");
            is = url.openConnection().getInputStream();   // connection.getInputStream();								// Receive reference to the connection input stream

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();		// create an instance of the Document factory
            DocumentBuilder builder = factory.newDocumentBuilder();						// create with the factory new Doc Builder
            Document doc = builder.parse(is);

            NodeList lastModifiedList = doc.getElementsByTagName("LAST_UPDATE");		// get the last_update
            System.out.println("Last Updated value = " + lastModifiedList.item(0).getTextContent());

            NodeList allCurrenciesList = doc.getElementsByTagName("CURRENCY");						// create node list of all the currency
            for (int i=0; i < allCurrenciesList.getLength(); i++)
            {
                NodeList singleCurrency = allCurrenciesList.item(i).getChildNodes();
                System.out.println("Current currency details:");
                System.out.println(singleCurrency.item(1).getTextContent());
                System.out.println(singleCurrency.item(3).getTextContent());
                System.out.println(singleCurrency.item(5).getTextContent());
                System.out.println(singleCurrency.item(7).getTextContent());
                System.out.println(singleCurrency.item(9).getTextContent());
                System.out.println(singleCurrency.item(11).getTextContent());
            }
            System.out.println("Which currency is missing???");

        } catch (MalformedURLException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ProtocolException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ParserConfigurationException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SAXException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        finally
        {
            if (is != null)
            {
                try
                {
                    is.close();
                } catch (IOException e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }

    }
}
