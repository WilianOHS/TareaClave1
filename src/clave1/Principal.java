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
public class Principal {
    private static Principal unicaInstancia;

    public static Principal getInstancia() {
        if(unicaInstancia == null)
            unicaInstancia = new Principal();
        return unicaInstancia;
    }
    
    private Principal() {}
    public void ejecutar() {
        int opt;
        do{
            //Llamado del metodo menu
            opt = menu();
            switch (opt){
                case 1:
                    System.out.println("----TORRES DE HANOI----");
                    int n = Integer.parseInt(Lector.leer("Ingrese un numero de discos"));
                    //Llamado del metodo hanoi
                    NumerosHanoi.Hanoi(n, 1, 2, 3);
                    break;
                case 2:
                    int n1;
                    System.out.println("----MONTECARLO----");
                    n1 = Integer.parseInt(Lector.leer("Ingrese un numero"));
                    //LLamado del metodo monteCarlo
                    NumerosMonteCarlo.monteCarlo(n1);
                    break;
                case 3:		
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("La opcion no es valida");	
            }

        }while (opt!=3);
    }
    //Metodo para menu
    public int  menu(){
            String opciones=
                "\n ---MENU PINCIPAL---"+
                "\n1.Resolver las torres de hanoi"+
                "\n2.Simular montecarlo"+
                "\n3.Salir"+
                "\nSeleccione Opcion: ";
            return Integer.parseInt(Lector.leer(opciones));
    }

}
