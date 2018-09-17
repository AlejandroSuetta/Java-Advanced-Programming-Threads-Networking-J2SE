package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class ServidorChat implements Runnable{
    private JTextArea txa;

    public ServidorChat(JTextArea txa) {
        this.txa = txa;
    }
    
    @Override public void run() {
        try (ServerSocket ss = new ServerSocket(8000);){
            while(true) {
                try (Socket so = ss.accept();
                        BufferedReader in = new BufferedReader(
                            new InputStreamReader(so.getInputStream()))){
                    String ip = so.getInetAddress().getHostAddress();
                    String origen = "";
                    
                    for(String st : MapaDirecciones.getMapa().keySet()){
                        if(ip.equals(MapaDirecciones.getMapa().get(st))){
                            origen = st;
                        }//en if()
                    }//end forEach
                    
                    String mensaje = in.readLine();
                    
                    txa.append(origen + " -> " + mensaje + "\n");
                } catch(Exception e) {e.printStackTrace();}
            }//end while()
        } catch(Exception e) {e.printStackTrace();}
    }//end metodo run()
}//end classServidorChat()