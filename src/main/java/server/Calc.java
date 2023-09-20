package server;
/* UNIVERSIDADE FEDERAL DE ITAJUBÁ
   INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO

   COM242 - SISTEMAS DISTRIBUIDOS
   Vitória Thais da Silva
   20/09/2023

   RMI - Bhaskara
   Programa que utiliza funções remotas para calcular a formula de Bhaskara.

   INTERFACE dos Objetos Remotos
*/

import java.rmi.Remote;
import java.rmi.RemoteException;

// Criação de uma interface chamada Calc, que define os contratos para acesso a função que calcula a fórmula
public interface Calc extends Remote {
   double calcularBhaskara(double a, double b, double c) throws RemoteException;
}