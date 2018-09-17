package clase03;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMinimo {
    public static void main(String[] args) throws Exception{
        String mensaje = "Servidor de Alejandro!";
        //String mensaje = "<h1>Servidor de Alejandro!</h1>";
        //mensaje =       "HTTP/1.1 200 OK\n"
        //            +   "Content-Type : text/html\n"
        //            +   "Content-Length: " + mensaje.length() + "\n\n"
        //            +   mensaje;
        //String mensaje = System.getProperties().toString();
        ServerSocket ss = new ServerSocket(4000, 500); //los 500 son segundo!!!
        
        while(true){
            System.out.println("Esperando conexion de cliente.");
            Socket so = ss.accept();
            System.out.println("Se conecto " + so.getInetAddress());
            OutputStream out = so.getOutputStream();
            out.write(mensaje.getBytes());
            out.close();
            so.close();
            System.out.println("Se cerro la conexion.");
        }
    }
}