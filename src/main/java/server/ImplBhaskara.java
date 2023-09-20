package server;

import java.rmi.RemoteException;

public class ImplBhaskara implements Calc {
    public double calcularBhaskara(double a, double b, double c) throws RemoteException {
        // Implementação da fórmula de Bhaskara
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            throw new RemoteException("Discriminante negativo: não há raízes reais.");
        }
        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        System.out.println("Valor baskara 1"+raiz1);
        System.out.println("Valor baskara 2"+raiz1);

        return raiz1;
    }
}
