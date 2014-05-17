package il.ac.shenkar.chat.server;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerApplication
{
    public static void main(String args[])
    {
        ServerSocket server = null;
        MessageBoard mb = new MessageBoard();
        try
        {
            server = new ServerSocket(1200);
        } catch (IOException e)
        {
        }
        Socket socket = null;
        ClientDescriptor client = null;
        ConnectionProxy connection = null;
        while (true)
        {
            try
            {
                System.out.println("server accept...");
                /* This line cause the Application to enter "blocking" mode until a new connection will be establish
                *  The new connection will be represented as a Socket
                * */
                socket = server.accept();
                connection = new ConnectionProxy(socket);    /*Create new ConnectionProxy with the new connection (Socket)*/
                client = new ClientDescriptor();             /*Create new ClientDescriptor class for the new client who just connected*/
                connection.addConsumer(client);              /*The ClientDescriptor is the ConnectionProxy consumer */
                client.addConsumer(mb);                      /*The mb is the ClientDescriptor consumer*/
                mb.addConsumer(connection);                  /*The ConnectionProxy is the mb consumer*/
                connection.start();                          /*Start the ConnectionProxy Thread -> Start listen to messages*/

                /*
                * The Message Flow throw the Components:
                * The ConnectionProxy will get the message from the client side, read it and call his consumer (ClientDescriptor)
                * The ClientDescriptor will get the message from the ConnectionProxy, add some text regarding the specific consumer and call his consumer (mb)
                * The mb will get the message from the ClientDescriptor and will sent it to ALL of his consumers (List of ConnectionProxy)
                * The ConnectionProxy will get the message back from the mb and will write it to the client side (the client displays it on his side)
                * */
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
