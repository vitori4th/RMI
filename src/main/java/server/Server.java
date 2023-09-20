package server;

import server.Calc;
import server.ImplBhaskara;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ImplBhaskara {
    public Server(){}
    public static void main(String args[]){
        try{
            System.setProperty("java.rmi.server.hostname", "172.17.138.107");
            ImplBhaskara obj = new ImplBhaskara();

            Calc stub = (Calc) UnicastRemoteObject.exportObject(obj,0);

            Registry registro = LocateRegistry.createRegistry(49152);
            registro.rebind("Calc", stub);
        }catch(Exception e){
            System.out.println("Erro no servidor:" + e.toString());
            e.printStackTrace();
        }
    }


}
