package rmi_client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import interfaces.IMethods;

public class Client
{

    public static void main(String[] args)
    {
        if (System.getSecurityManager() == null)
        {
            System.setSecurityManager(new SecurityManager());
        }

        try
        {
            String name = "Methods";
            Registry registry = LocateRegistry.getRegistry(args[0]);
            IMethods comp = (IMethods) registry.lookup(name);
            System.out.println(comp.add(3, 4));
        }
        catch (Exception e)
        {
            System.err.println("ClientAddMethod exception:");
            e.printStackTrace();
        }
    }
    
}