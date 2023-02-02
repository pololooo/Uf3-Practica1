/*
3. Amplia el programa anterior per tal que:
a) Mostri per pantalla tot el contingut del fitxer
b) Mostri per pantalla el contingut de la línia X, sent X un número que li
demanarem a l’usuari.
c) Inserti una línia al començament del fitxer
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
