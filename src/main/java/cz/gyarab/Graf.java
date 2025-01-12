package cz.gyarab;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

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
     * @throws JsonProcessingException 
     */
    public void ulozGrafDoSouboru(String jmenoSouboru) throws JsonProcessingException {
        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writeValueAsString(this);
        System.out.println(xml);


        // TODO
    }
}
