/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Desde esta clase se hace el pedido de los datos 
que el usuario ingresa desde el teclado */
package clave1;

import java.util.Scanner;

/**
 *
 * @author Wilian Osmin Hernandez Sanchez HS17002
 */
public class Lector {
     private static Scanner S = new Scanner(System.in);
    
    public static String leer(String pregunta) {
        System.out.println(pregunta);
        return S.nextLine();
    }
}
