package Bordfodboldturnering;

import java.util.ArrayList;

public class Hold {
    private int Points;
    private int målscore;
    private String holdNavn;
    private int antalSpillere;
    private int holdID;
    private ArrayList<Kamp>kampHistorik=new ArrayList<>();

    public Hold(int holdID,String holdNavn, int antalSpillere) {
        this.holdID=holdID;
        this.holdNavn = holdNavn;
        this.antalSpillere = antalSpillere;

    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int points) {
        Points = points;
    }

    public String getHoldNavn() {
        return holdNavn;
    }

    @Override
    public String toString(){
        return holdNavn;
    }

}
