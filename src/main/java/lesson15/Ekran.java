package lesson15;

public class Ekran {

    private String model;
    private String istehsalci;
    private String boyu;
    private Olchuler olchuler;

    public Ekran(String model, String istehsalci, String boyu, Olchuler olchuler) {
        this.model = model;
        this.istehsalci = istehsalci;
        this.boyu = boyu;
        this.olchuler = olchuler;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIstehsalci() {
        return istehsalci;
    }

    public void setIstehsalci(String istehsalci) {
        this.istehsalci = istehsalci;
    }

    public String getBoyu() {
        return boyu;
    }

    public void setBoyu(String boyu) {
        this.boyu = boyu;
    }

    public Olchuler getOlchuler() {
        return olchuler;
    }

    public void setOlchuler(Olchuler olchuler) {
        this.olchuler = olchuler;
    }

    public void close_monitor() {
        System.out.println("Monitor closed;");
    }
}
