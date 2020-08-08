package MyRemoteInterfaceAndService;

import java.rmi.*;

public interface MyRemote {
	
	public String sayHello() throws RemoteException;
}
