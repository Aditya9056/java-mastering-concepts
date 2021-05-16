import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class client_prg{
    public static void main(String[] args) {
        String host ="localhost";
        Scanner nw = new Scanner(System.in);

        System.out.println("Enter no.1");
        int a = nw.nextInt();
        System.out.println("Enter no.2");
        int b = nw.nextInt();

        try {
            remote_interface remobj =(remote_interface)Naming.lookup("rmi://"+host+"/remote_interface");
            System.out.println(remobj.mul(a, b)); 
        } catch (RemoteException re) {
            re.printStackTrace();
        }
        catch(NotBoundException nbe){
            nbe.printStackTrace();
        }
        catch(MalformedURLException mfe){
            mfe.printStackTrace();
        }


    }
}