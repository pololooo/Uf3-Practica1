/*
1. Crea un programa que llegeixi frases per teclat i les vagi guardant en un fitxer
“textos.txt”. El programa finalitzarà quan s’entri una cadena buida.
 */
package uf3.practica1;

import java.util.*;
import java.io.*;

public class Uf3Practica1Ex1 {

    public static void LlegirFrase() {

    }

    public static void main(String[] args) {
        File textos = new File("./textos.txt");
        FileWriter writer = new FileWriter(textos, true);
        PrintWriter pw = new PrintWriter(writer);

        pw.println("Hola");

        pw.flush();

        writer.close();
    }

}
