package deputy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by �������� ������
 * on 04.11.2017.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
