/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave1;

/**
 *
 * @author Wilian Osmin Hernandez Sanchez HS17002
 */
public abstract class NumerosHanoi{
    //Método Torres de Hanoi Recursivo

    /**
     *
     * @param n
     * @param origen
     * @param auxiliar
     * @param destino
     */
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
    if(n==1)
    System.out.println("mover disco de " + origen + " a " + destino);
    else{
     Hanoi(n-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(n-1, auxiliar, origen, destino);
    }
}

}
