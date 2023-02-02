/*
2. Amplia el programa anterior per tal que:
a) Si el fitxer no existeix, que el generi.
b) Si el fitxer ja existeix, que afegeixi el contingut al final.
c) Si l’usuari escriu @ESBORRA, cal esborrar el contingut del fitxer.
 */
package uf3.practica1;

import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Uf3Practica1Ex2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        File txt = new File("./arxiu.txt");
        FileWriter writer;
        PrintWriter pw;

        if (txt.exists()) {
            writer = new FileWriter(txt, true);
        } else {
            txt.createNewFile();
            writer = new FileWriter(txt, false);
        }

        pw = new PrintWriter(writer);

        String missatge = scan.nextLine();

        while (!missatge.equals("")) {
            if (missatge.equals("@ESBORRA")) {
                pw.flush();
                writer.close();
                txt.delete();
                txt.createNewFile();
                writer = new FileWriter(txt, false);
                pw = new PrintWriter(writer);

            } else {
                pw.println(missatge);
            }
            missatge = scan.nextLine();
        }

        writer.flush();
        writer.close();
    }
}
