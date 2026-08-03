package uff.ic.lleme.tcc00328.aulas.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadText {

    public static void main(String[] args) {
        String filename = "src//main//java//uff//ic//lleme//ed//aulas//java//files//users.txt";
        try (InputStream input = new FileInputStream(filename);) {
            Scanner in = new Scanner(input);
            in = new Scanner(System.in);
            while (in.hasNext()) {
                User u = new User(in.nextInt(), in.nextLine());
                System.out.println(u.toString());
            }
            //input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadText.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadText.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
