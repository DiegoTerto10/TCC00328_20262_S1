package uff.ic.lleme.tcc00328.aulas.java.files;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteText {

    public static void main(String[] args) {
        int count = 0;
        User[] users = new User[100];
        users[count++] = new User(1, "Luiz");
        users[count++] = new User(2, "André");
        users[count++] = new User(3, "Luiz André");

        String filename2 = "src//main//java//uff//ic//lleme//ed//aulas//java//files//report.txt";
        try (OutputStream out = new FileOutputStream(filename2, false); OutputStreamWriter writer = new OutputStreamWriter(out); BufferedWriter bw = new BufferedWriter(writer);) {
            for (User u : users)
                bw.write(u.toString() + "\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
