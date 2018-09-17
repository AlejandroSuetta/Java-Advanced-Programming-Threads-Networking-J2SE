package serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializar {
    public static void main(String[] args) throws Exception{
        Persona p1 = new Persona("Ana", "Garcia", 23);
        Persona p2 = new Persona("Laura", "Salas", 39);
        Persona p3 = new Persona("Javier", "Lara", 43);
        
        //Serealizacion de ojetos a un archivo (guarda en binario)
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("persoas.dat")));
        out.writeObject(p1);
        out.writeObject(p2);
        out.writeObject(p3);
        
        out.close();
        
        //Deserealizacion de objeto
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("persoas.dat")));
        Persona p;
        
        try {
            while(true) {
                p = (Persona)in.readObject();
                System.out.println(p);
            }
        } catch(IOException e) {
        } catch (Exception e) {System.out.println(e);;}
    }
}