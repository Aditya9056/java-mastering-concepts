import java.rmi.*;

    public interface remote_interface extends Remote {
        public int mul(int x, int y) throws RemoteException;
    }