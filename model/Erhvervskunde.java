package model;

public class Erhvervskunde extends Kunde{
    private int CVR;
    public Erhvervskunde(String navn, String adresse, int alder, int CVR) {
        super(navn, adresse, alder);
        this.CVR = CVR;
    }

    @Override
    public double beregnUdlejningsPris(double prisPrDag, Udlejning udlejning) {
        return 0;
    }
}
