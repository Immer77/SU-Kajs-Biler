package model;

import java.util.ArrayList;

public abstract class Kunde {
    private String navn;
    private String adresse;
    private int alder;
    private final ArrayList<Udlejning> udlejninger = new ArrayList<>();

    public Kunde(String navn, String adresse, int alder){
        this.navn = navn;
        this.adresse = adresse;
        this.alder = alder;
    }

    public abstract double beregnUdlejningsPris(double prisPrDag, Udlejning udlejning);

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAlder() {
        return alder;
    }

    public ArrayList<Udlejning> getUdlejninger() {
        return new ArrayList<>(udlejninger);
    }

}
