package serializacion;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientSerializacion {
    public static void main(String[] args) throws Exception{
        Persona persona = new Persona("Alejandro", "Suetta", 24);
        Socket so = new Socket("10.11.1.90", 8000);
        ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(so.getInputStream());
        
        out.writeObject(persona);
        System.out.println(in.readUTF());
        
        out.close();
        in.close();
        so.close();
    }
}
