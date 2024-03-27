package lesson15;

public class Computer {

    private Kart kart;
    private Blok blok;
    private Ekran ekran;

    public Computer(Kart kart, Blok blok, Ekran ekran) {
        this.kart = kart;
        this.blok = blok;
        this.ekran = ekran;
    }

    public Kart getKart() {
        return kart;
    }

    public void setKart(Kart kart) {
        this.kart = kart;
    }

    public Blok getBlok() {
        return blok;
    }

    public void setBlok(Blok blok) {
        this.blok = blok;
    }

    public Ekran getEkran() {
        return ekran;
    }

    public void setEkran(Ekran ekran) {
        this.ekran = ekran;
    }
}
