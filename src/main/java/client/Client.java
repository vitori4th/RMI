package client;

import server.Calc;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    private Client(){}
    public static void main (String []  args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println(("Digite valor de a:"));
        double a = keyboard.nextDouble();
        System.out.println(("Digite valor de b:"));
        double b = keyboard.nextDouble();
        System.out.println(("Digite valor de c:"));
        double c = keyboard.nextDouble();

        try{
            Registry registry = LocateRegistry.getRegistry("172.17.138.107", 49152);
            Calc stub = (Calc) Naming.lookup("rmi://172.17.138.107:49152/Calc");
            System.out.println(stub.calcularBhaskara(a,b,c));
        }catch(Exception e){
            System.err.println("Client exception:" + e.toString());
            e.printStackTrace();
        }
    }

}
