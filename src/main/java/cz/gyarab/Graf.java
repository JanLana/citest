package cz.gyarab;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;

import lombok.Data;

/**
 * trida reprezentujici graf
 */
@Data
public class Graf {
    private Map<String,Vrchol> vrcholy;

    /**
     * vytvor novy prazdny Graf
     */
    public Graf() {
        vrcholy = new HashMap<>();
    }

    /**
     * nacti Graf ulozeny do souboru
     * 
     * @param jmenoSouboru soubor s grafem ulozenym pomoci metody [#ulozGrafDoSouboru]
     */
    public Graf(String jmenoSouboru) {
        // TODO
    }

    /**
     * vrati Vrchol grafu podle jmena.
     *
     * Pokud vrchol s timto jmenem jeste neexistuje, vytvori novy. Pokud uz
     * existuje,
     * vrati jiz existujici.
     * @param jmeno jmeno vrcholu
     * @return vrchol s danym jmenem
     */
    public Vrchol dejVrchol(String jmeno) {
        return vrcholy.computeIfAbsent(jmeno, x -> new Vrchol(x));
    }

    /**
     * ulozi existujici graf do souboru. (doporucuji pouzit serializaci :-))
     * @param jmenoSouboru jmeno souboru do ktereho ulozi graf
     * @throws IOException kdyz neco nevyjde...
     */
    public void ulozGrafDoSouboru(String jmenoSouboru) throws IOException {
        ObjectMapper mapper = new ObjectMapper(); // new YAMLFactory());
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File(jmenoSouboru), this);

        System.out.println(mapper.writeValueAsString(this));
    }
}
