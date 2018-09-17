package clase03;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClienteMinimo {
    public static void main(String[] args) throws Exception{
        Socket so = new Socket("10.11.1.90", 4000);
        BufferedReader in = new BufferedReader(new InputStreamReader(so.getInputStream()));
        System.out.println(in.readLine());
        //InputStream in = so.getInputStream();
        //int car;
        //while((car = in.read()) != -1) {
        //    System.out.print((char)car );
        //}
        in.close();
        so.close();
    }
}