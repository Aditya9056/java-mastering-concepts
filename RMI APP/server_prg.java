import java.rmi.*;
import java.net.*;

public class server_prg{
    public static void main(String[] args) {
        try{
            implementation_remote_interface localobj = new implementation_remote_interface();
            Naming.rebind("rmi:///remote_interface", localobj);
        }
        catch(RemoteException re){
            re.printStackTrace();
        }
        catch(MalformedURLException mfe){
            mfe.printStackTrace();
        }
    }
}