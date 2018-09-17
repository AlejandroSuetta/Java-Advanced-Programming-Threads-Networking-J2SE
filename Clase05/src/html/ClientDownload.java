package html;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class ClientDownload {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://pay.google.com/about/static/images/social/og_image.jpg");
        url.openConnection();
        System.out.println(url.getFile());
        //File file = new File(url.getFile());
        InputStream in = url.openStream();
        OutputStream out = new FileOutputStream("foto.jpg");
        
        int car;
        int cont = 0;
        System.out.println("Iniciando copia.");
        //System.out.println(in.read());
        while((car=in.read()) != -1) {
            out.write(car);
            System.out.println("Copiando " + (cont++) + " bytes.");
        }
        System.out.println("Finalizando copia.");
        
        in.close();
        out.close();
    }
}
