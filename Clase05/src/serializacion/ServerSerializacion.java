package serializacion;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSerializacion {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(8000)){
            while (true) {
                System.out.println("Esperando conexion...");
                
                try (
                        Socket so = ss.accept();
                        ObjectInputStream in = new ObjectInputStream(so.getInputStream());
                        ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream());
                ) {
                    System.out.println("Se conecto " + so.getInetAddress());
                    
                    try {
                        Persona persona = (Persona)in.readObject();
                        out.writeUTF("Se recibio el objeto Persona."); 
                        System.out.println(persona);
                    } catch(Exception ex2) {
                        out.writeUTF("No se recibio el objeto Persona.");
                    }
                } catch(Exception ex) {
                    System.out.println(ex);
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}