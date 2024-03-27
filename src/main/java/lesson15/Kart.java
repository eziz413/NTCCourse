package lesson15;

public class Kart {

    private String model;
    private String istehsalci;
    private  int port;
    private String emeliyyat_system;

    public Kart(String model, String istehsalci, int port, String emeliyyat_system) {
        this.model = model;
        this.istehsalci = istehsalci;
        this.port = port;
        this.emeliyyat_system = emeliyyat_system;
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

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getEmeliyyat_system() {
        return emeliyyat_system;
    }

    public void setEmeliyyat_system(String emeliyyat_system) {
        this.emeliyyat_system = emeliyyat_system;
    }

    public void main_system_load(String man_system){
        this.emeliyyat_system=man_system;
        System.out.println("Emeliyyat sistemi ishe salindi "+man_system);
    }
}
