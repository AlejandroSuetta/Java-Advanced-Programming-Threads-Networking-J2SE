package clase03;

import java.net.Socket;

public class ClientMinimo2 {
    public static void main(String[] args) throws Exception{
        String mensaje = "Hola soy Alejandro!";
        Socket so = new Socket("10.11.1.90", 5000);
        so.getOutputStream().write(mensaje.getBytes());
        so.close();
    }
}
