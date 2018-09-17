package html;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ClinetHTML {
    public static void main(String[] args) throws Exception{
        String stUrl = "https://www.facebook.com";
        URL url = new URL(stUrl);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
        in.lines().forEach(System.out::println);       
        in.close();
    }
}