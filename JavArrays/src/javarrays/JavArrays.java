/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarrays;

import java.util.Scanner;


/**
 *
 * @author soib1a04
 */
public class JavArrays {

    public static void notaMitja() {
        int[] notes = {9, 5, 8, 5, 4, 2, 6, 0};
        double suma = 0, mitja = 0;
        int i = 0;
        while (i < notes.length) {
            suma = suma + notes[i];
            i++;
        }
        mitja = suma / notes.length;
        System.out.println("La nota mitja es " + mitja);
    }

    public static void notaMitja2() {
        int[] notes = {9, 5, 8, 5, 4, 2, 6, 0};
        double suma = 0, mitja = 0;
        for (int i = 0; i < notes.length; i++) {
            suma = suma + notes[i];
        }
        mitja = suma / notes.length;
        System.out.println("La nota mitja es " + mitja);
    }

    public static void notaMin() {
        int[] notes = {9, 5, 8, 5, 4, 2, 6, 10};
        int notamin = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notamin > notes[i]) {
                notamin = notes[i];
            };
        }
        System.out.println("La nota mas baja es " + notamin);
    }

    public static void notaMax() {
        int[] notes = {9, 5, 8, 50, 4, 2, 6, 10};
        int notamax = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notamax < notes[i]) {
                notamax = notes[i];
            }
        }
        System.out.println("La nota mas alta es " + notamax);
    }

    public static void histograma() {
        String linea = ("Bienvenido Al curso de JavA");
        int[] nrovocales = {0, 0, 0, 0, 0};
        char[] vocal = {'a', 'e', 'i', 'o', 'u'};
        int posicion = 0;
        int largo = linea.length();
        while (posicion < largo) {
            // toLowerCase pasa a minus todas las vocales
            switch (linea.toLowerCase().charAt(posicion)) {
                case 'a':
                    nrovocales[0]++;
                    break;
                case 'e':
                    nrovocales[1]++;
                    break;
                case 'i':
                    nrovocales[2]++;
                    break;
                case 'o':
                    nrovocales[3]++;
                    break;
                case '4':
                    nrovocales[4]++;
                    break;
            }
            posicion++;
        }
        System.out.println("Histogram");
        for (int i = 0; i < nrovocales.length; i++) {
            System.out.print("'" + vocal[i] + "'");
            for (int v = 0; v < nrovocales[i]; v++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void euromillon() {
        int[] premiados = {0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) //guarda 5 nros del 1 al 50
        {
            premiados[i] = (int) (Math.random() * 50) * 1;
        }
        for (int i = 5; i < 7; i++) //guarda 2 estrellas del 1 al 12
        {
            premiados[i] = (int) (Math.random() * 12) * 1;
        }
        System.out.println("Los numeros premiados en el Euromillon del dia de hoy son:");
        for (int i = 0; i < 7; i++) {
            System.out.print(" " + premiados[i]);// imprime nros premiados
        }
        System.out.println();
        
    }

    public static String entradaTeclado() {
        String docuInput;
        System.out.println("Introduzca un DNI o NIE para calcular su letra: ");
        Scanner entrada = new Scanner(System.in);
        docuInput = entrada.nextLine();
        return docuInput;
    }

    public static void calcularLletraDniNie() {
        int numero = 0;
        char lletra;
        char[] lletraNIE = {'X', 'Y', 'Z'};
        char[] lletresDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        String docuInput = entradaTeclado();

        lletra = docuInput.toUpperCase().charAt(0);
        for (int i = 0; i < lletraNIE.length; i++) {
            if (lletra == lletraNIE[i]) {
                docuInput = i + docuInput.substring(1, 8);
            }
        }
        try {
            numero = Integer.parseInt(docuInput);

            if (numero < 100000000) {
                System.out.println("La letra del documento " + lletra + docuInput.substring(1, 8) + " es " + lletresDni[numero % 23]);
            }
        } catch (Exception err) {
            System.out.println("ATENCION! El numero no debe ser superior a 99.999.999");
            System.out.println("numero " + numero);
            calcularLletraDniNie();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //notaMitja();
        //notaMitja2();
        //notaMin();
        //notaMax();
        //histograma();
        //euromillon();
        calcularLletraDniNie();
    }

}
