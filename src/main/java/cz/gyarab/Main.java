package cz.gyarab;

import com.fasterxml.jackson.core.JsonProcessingException;

/** main trida */
public class Main {
     
    /**
     * main metoda
     * 
     * @param args argumenty program
     * @throws JsonProcessingException 
     */
    public static void main(String[] args) throws JsonProcessingException {
        var g = new Graf();
        var v1 = g.dejVrchol("v1");
        var v2 = g.dejVrchol("v2");
        var v3 = g.dejVrchol("v3");

        v1.pridejSouseda(v2);
        v2.pridejSouseda(v3);

        g.ulozGrafDoSouboru("graf.dat");

        System.out.println("JJJJJJJJ");
    }
}
