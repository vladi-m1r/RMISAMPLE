package interfaces;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMethods extends Remote
{
    public int add(int x, int y) throws RemoteException;
}