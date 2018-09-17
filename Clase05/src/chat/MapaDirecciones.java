package chat;

import java.util.Map;
import java.util.TreeMap;

public class MapaDirecciones {
    public static Map<String,String>getMapa(){
        Map<String,String> mapa = new TreeMap();
        
        mapa.put("Carlos","10.11.1.90");
        mapa.put("Gonzalo","10.11.1.10");
        mapa.put("Alejandro","10.11.1.25");
        mapa.put("Gustavo","10.11.1.101");
        mapa.put("Astro","10.11.1.108");
        mapa.put("Rodrigo","10.11.1.118");
        mapa.put("Federico","10.11.1.122");
        mapa.put("Adriana","10.11.1.143");
        
        return mapa;
    }
}
