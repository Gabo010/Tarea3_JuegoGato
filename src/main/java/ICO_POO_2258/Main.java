package ICO_POO_2258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String frase = "Este Programa del Juego Gato funciona con Puras Mayusculas";
        System.out.println(frase);

        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();

        char X = 'X';
        char O = 'O';
        char guion = '_';
        int longitud = cadena.length();


        if (longitud == 9){
            char v0 = cadena.charAt(0);
            char v1 = cadena.charAt(1);
            char v2 = cadena.charAt(2);
            char v3 = cadena.charAt(3);
            char v4 = cadena.charAt(4);
            char v5 = cadena.charAt(5);
            char v6 = cadena.charAt(6);
            char v7 = cadena.charAt(7);
            char v8 = cadena.charAt(8);

        if (((v0 == X)|| (v0 == O) ||(v0 == guion)) && ((v1 == X)|| (v1 == O) ||(v1 == guion)) && ((v2 == X)|| (v2 == O) ||(v2 == guion)) && ((v3 == X)|| (v3 == O) ||(v3 == guion)) && ((v4 == X)|| (v4 == O) ||(v4 == guion)) && ((v5 == X)|| (v5 == O) ||(v5 == guion)) && ((v6 == X)|| (v6 == O) ||(v6 == guion)) && ((v7 == X)|| (v7 == O) ||(v7 == guion)) && ((v8 == X)|| (v8 == O) ||(v8 == guion))) {
            System.out.println(teclado);
            System.out.println("-----");
            System.out.println("|" + cadena.charAt(0) + cadena.charAt(1) + cadena.charAt(2) + "|");
            System.out.println("|" + cadena.charAt(3) + cadena.charAt(4) + cadena.charAt(5) + "|");
            System.out.println("|" + cadena.charAt(6) + cadena.charAt(7) + cadena.charAt(8) + "|");
            System.out.println("-----");
        }
        else {
            System.out.println("Ingrese una cadena de caracteres valida");
        }
        }
        System.out.println("\nFIN DEL JUEGO");
    }
}