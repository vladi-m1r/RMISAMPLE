package rmi_server;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import interfaces.IMethods;

public class Server implements IMethods
{

    public Server()
    {
        super();
    }

    public static void main(String[] args)
    {
        if (System.getSecurityManager() == null)
        {
            System.setSecurityManager(new SecurityManager());
        }
        try
        {
            String name = "Methods";
            IMethods engine = new Server();
            IMethods stub =
                (IMethods) UnicastRemoteObject.exportObject(engine, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
            System.out.println("ComputeEngine bound");
        }
        catch (Exception e)
        {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
    }

    public int add(int x, int y) throws RemoteException
    {
        return x + y;
    }

}