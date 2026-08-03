package uff.ic.lleme.tcc00328.aulas.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadObject {

    public static void main(String[] args) {
        String filename = "src//main//java//uff//ic//lleme//ed//aulas//java//files//users.dat";
        try (InputStream in = new FileInputStream(filename); ObjectInputStream s = new ObjectInputStream(in);) {
            User[] users = (User[]) s.readObject();
            for (User u : users) {
                if (u == null)
                    break;
                System.out.println(u.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
