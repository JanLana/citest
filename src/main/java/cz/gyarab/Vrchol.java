package cz.gyarab;

import java.util.Collection;
import java.util.HashSet;

import lombok.Data;

/**
 * trida reprezentujici jeden vrchol grafu a pamatuje si vrcholy, se kterymi
 * sousedi
 */
@Data
public class Vrchol {
    private String jmeno;
    private Collection<Vrchol> sousedi;

    /**
     * vrchol grafu
     *
     * @param jmeno jmeno vrcholu
     */
    public Vrchol(String jmeno) {
        this.jmeno = jmeno;
        sousedi = new HashSet<>();
    }

    /**
     * pridej vrchol `v` do seznamu sousednich vrcholu
     * 
     * @param v vrchol ktery je muj soused
     */
    public void pridejSouseda(Vrchol v) {
        sousedi.add(v);
    }

    /**
     * otestuje, zda je vrchol `v` mym sousdem
     * 
     * @param v vrchol ktery je muj soused
     * 
     * @return true pokud je v mym primym sousedem
     */
    public boolean jeSousedem(Vrchol v) {
        return sousedi.contains(v);
    }

    /**
     * otestuje, zda existuje cesta mezi mnou a vrcholem `v`
     *
     * @param v vrchol ke kteremu vede cesta
     * 
     * @return true pokud cesta existuje
     */
    public boolean existujeCestaDo(Vrchol v) {
        return true;
    }
}
