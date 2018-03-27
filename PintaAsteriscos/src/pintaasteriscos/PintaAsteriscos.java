/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintaasteriscos;

/**
 *
 * @author soib1a04
 */
public class PintaAsteriscos {

    public static void quadreA() {
        // TODO code application logic here
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");

    }

    public static void quadreB() {
        // TODO code application logic here
        for (int fila = 0; fila < 7; fila++) {
            System.out.println("*******");
        }

    }

    public static void quadreC() {
        // TODO code application logic here
        for (int fila = 0; fila < 7; fila++) {
            for (int col = 0; col < 7; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void quadreD() {
        int fila = 0;
        int col = 0;
        while (fila < 7) {
            col = 0;

            while (col < 7) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            fila++;
        }

    }

    public static void trianguloA() {
        // TODO code application logic here
        for (int fila = 0; fila < 7; fila++) {
            for (int col = 0; col <= fila; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void trianguloB() {
        // TODO code application logic here
        int fila = 0;
        int col = 0;
        while (fila < 7) {
            col = 0;
            while (col <= fila) {
                System.out.print("*");
                col++;
            }
            fila++;
            System.out.println();
        }

    }
    public static void comparar(int num1, int num2) {
        // TODO code application logic here

        if (num1 < num2) {
            System.out.println("Num1 (" + num1 + ") es menor que Num2 (" + num2+")");
        } 
        else {
            if (num1 == num2) {
                System.out.println("Num1 (" + num1 + ") es igual que Num2 (" + num2+")");
            } 
            else {
                System.out.println("Num1 (" + num1 + ") es mayor que Num2 (" + num2+")");
            }
        }

    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*System.out.println("Quadre");
        quadreD();
        System.out.println("Triangle");
        trianguloB();*/
        comparar(1,2);
    }
}
