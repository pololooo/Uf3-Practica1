/*
1. Crea un programa que llegeixi frases per teclat i les vagi guardant en un fitxer
“textos.txt”. El programa finalitzarà quan s’entri una cadena buida.
 */
package uf3.practica1;

import java.util.*;
import java.io.*;

public class Uf3Practica1Ex1 {

    static Scanner scan = new Scanner(System.in);
    static final String FITXER = "./textos.txt";

    public static void main(boolean crearF, String escribir, String esborra) throws IOException {
        File txt = new File(FITXER);
        FileWriter fileW = new FileWriter(txt, crearF);
        PrintWriter printW = new PrintWriter(fileW);

        String missatge = scan.nextLine();

        while (!missatge.equals(escribir)) {
            if (missatge.equals(esborra)) {
                fileW.close();
                fileW = new FileWriter(txt, false);
                printW = new PrintWriter(fileW);
            } else {
                printW.write(missatge + "\n");
            }
            missatge = scan.nextLine();
        }

        fileW.flush();
        fileW.close();
    }

    static void nuevaLinea() throws IOException {
        insertarLinea(false, "", null);
    }
}
