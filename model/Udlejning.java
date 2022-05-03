package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Udlejning {
    private LocalDate startDatoForUdlejning;
    private LocalDate slutDatoForUdlejning;
    private double prisPrDag;
    private Kunde kunde;

    public Udlejning(LocalDate startDatoForUdlejning, LocalDate slutDatoForUdlejning, double prisPrDag){
        this.startDatoForUdlejning = startDatoForUdlejning;
        this.slutDatoForUdlejning = slutDatoForUdlejning;
        this.prisPrDag = prisPrDag;
    }

    public double calculateTotalPrice(double prisPrDag){
        return prisPrDag * (ChronoUnit.DAYS.between(this.startDatoForUdlejning,this.slutDatoForUdlejning));
    }

    //GETTER AND SETTERS _______________________________________________________________

    public LocalDate getStartDatoForUdlejning() {
        return startDatoForUdlejning;
    }

    public void setStartDatoForUdlejning(LocalDate startDatoForUdlejning) {
        this.startDatoForUdlejning = startDatoForUdlejning;
    }

    public LocalDate getSlutDatoForUdlejning() {
        return slutDatoForUdlejning;
    }

    public void setSlutDatoForUdlejning(LocalDate slutDatoForUdlejning) {
        this.slutDatoForUdlejning = slutDatoForUdlejning;
    }

    public double getPrisPrDag() {
        return prisPrDag;
    }

    public void setPrisPrDag(double prisPrDag) {
        this.prisPrDag = prisPrDag;
    }
}
