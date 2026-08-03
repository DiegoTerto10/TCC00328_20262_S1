package uff.ic.lleme.tcc00328.aulas.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteObject {

    public static void main(String[] args) {
        int count = 0;
        User[] users = new User[100];
        users[count++] = new User(1, "Luiz");
        users[count++] = new User(2, "André");
        users[count++] = new User(3, "Luiz André");

        String filename = "src//main//java//uff//ic//lleme//ed//aulas//java//files//users.dat";
        try (OutputStream out = new FileOutputStream(filename, false); ObjectOutputStream s = new ObjectOutputStream(out);) {
            s.writeObject(users);
            s.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WriteObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
