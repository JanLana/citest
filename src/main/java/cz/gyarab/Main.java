package cz.gyarab;

import java.io.IOException;

/** main trida. Cely program je tu... */
public class Main {

    /** main konstruktor - uplne k nicemu :-) */
    public Main() {}

    /**
     * main metoda
     * 
     * @param args argumenty program
     * @throws IOException kdyz neco nevyjde ...
     */
    public static void main(String[] args) throws IOException {
        var g = new Graf();
        var v1 = g.dejVrchol("v1");
        var v2 = g.dejVrchol("v2");
        var v3 = g.dejVrchol("v3");

        v1.pridejSouseda(v2);
        v2.pridejSouseda(v3);

        g.ulozGrafDoSouboru("graf.json");
    }
}
