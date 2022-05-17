package pruebas;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class PruebasTests {

    private HashMap buildStats(String cadena) {
        HashMap stats = new HashMap();
        for(int i=0;i<cadena.length();i++) {
            if (stats.get(cadena.charAt(i)) == null) {
                stats.put(cadena.charAt(i),1);
            } else {
                stats.replace(cadena.charAt(i),(int)stats.get(cadena.charAt(i))+1);
            }

        }
        return stats;
    }

    @Test
    public void testCharFilter() {
        var stats = buildStats("abggdbsgagabsgdgadgovbsgsbsg");
        stats.forEach((key,value) -> {
            System.out.println("Letra: " + key + " veces: " + value);
        });
    }



}
