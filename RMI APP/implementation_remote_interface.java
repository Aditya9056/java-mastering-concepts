import java.rmi.*;
import java.rmi.server.*;

public class implementation_remote_interface extends UnicastRemoteObject implements remote_interface{

    implementation_remote_interface()throws RemoteException{}
    public int mul(int x, int y){return x*y;}
}