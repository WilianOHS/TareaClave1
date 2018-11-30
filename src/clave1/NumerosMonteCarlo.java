/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave1;

import java.util.Random;

/**
 *
 * @author Wilian Osmin Hernandez Sanchez HS17002
 */
public abstract class NumerosMonteCarlo{
        private static final Random RANDOM = new Random();
        /*
         hacer n conjeturas al azar, tomar la proporción de conjeturas en el círculo,
         y divídelo por las conjeturas totales (todas las cuales estarán en el cuadrado)
         esto te dará la relación A_square / A_circle, 4 / π
        */
        public static int monteCarlo(final int randomSamples) {
        int inCircle = 0;
        for(int i = 0; i < randomSamples; i++) {
            // genera variables aleatorias x / y entre -1, 1 (que se garantiza que están dentro del cuadrado
            final double x = 2 * RANDOM.nextDouble() - 1;
            final double y = 2 * RANDOM.nextDouble() - 1;
            if(inCircle(x, y)) {
                inCircle++;
            }
        }
        final double ratio = (double) inCircle / randomSamples;
        final double piApprox = ratio * 4; // la relación es 4 / π, entonces multiplica por 4 para obtener una aproximación π

        System.out.println("Muestras Aleatorias: " + randomSamples);
        System.out.println("En circulo: " + inCircle + ", En cuadrado: " + randomSamples);
        System.out.println("Aproximación PI: " + piApprox + ", Error: " + Math.abs(Math.PI - piApprox));
            return 0;
    }

    /*
        eq de círculo centrado en el origen: x ^ 2 + y ^ 2 = r ^ 2
         si (x) ^ 2 + (y) ^ 2 <r ^ 2 entonces está dentro del círculo donde r = 1
     */
    private static boolean inCircle(final double x, final double y) {
        // System.out.println(x + ", " + y);
        return x * x + y * y < 1.0;
    }

    

}
