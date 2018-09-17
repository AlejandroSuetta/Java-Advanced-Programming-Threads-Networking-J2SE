package clase03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMinimo2 implements Runnable{
    public static void main(String[] args) {
        new Thread(new ServidorMinimo2()).start();
    }
    @Override
    public void run() {
        try(ServerSocket ss = new ServerSocket(5000);) {  //try with resource(solo se pueden poner objetos que implementen Closable). No hay q poner el .close(), porque se cierra solo asi.
                while(true) {
                    System.out.println("Esperando conexin de cliete.");
                    try(
                            Socket so = ss.accept();
                            BufferedReader in = new BufferedReader(new InputStreamReader(so.getInputStream()));
                        ) {
                        System.out.println("Se conecto " + so.getInetAddress());
                        System.out.println(in.readLine());
                    } catch (Exception e) {e.printStackTrace();}
                }
        } catch (IOException ex) {ex.printStackTrace();}
    }
}