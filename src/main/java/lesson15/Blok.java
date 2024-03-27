package lesson15;

public class Blok {

    private String model;
    private String istehsalci;
    private String material;

    public Blok(String model, String istehsalci, String material) {
        this.model = model;
        this.istehsalci = istehsalci;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public void computeri_ac(){
        System.out.println("Computer achilir");
    }
}
