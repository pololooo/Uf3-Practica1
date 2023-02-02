/*
1. Crea un programa que llegeixi frases per teclat i les vagi guardant en un fitxer
“textos.txt”. El programa finalitzarà quan s’entri una cadena buida.
 */
package uf3.practica1;

import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Uf3Practica1Ex1 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            File txt = new File("./arxiu.txt");
            FileWriter writer = new FileWriter(txt, true);
            PrintWriter pw = new PrintWriter(writer);

            String missatge = scan.nextLine();

            while (!missatge.equals(null)) {
                if (missatge.equals(null)) {
                    writer.close();
                    writer = new FileWriter(txt, false);
                    pw = new PrintWriter(writer);
                } else {
                    pw.write(missatge + "\n");
                }
                missatge = scan.nextLine();
            }

            pw.println("Hola");

            writer.flush();
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(Uf3Practica1Ex1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
