package model;

public class PrivatKunde extends Kunde{
    private int CPR;

    public PrivatKunde(String navn, String adresse, int alder, int CPR) {
        super(navn, adresse, alder);
        this.CPR = CPR;
    }


    @Override
    public double beregnUdlejningsPris(double prisPrDag, Udlejning udlejning) {
        return udlejning.calculateTotalPrice(prisPrDag);

    }
}
