package lesson15;

public class Main2 {

    public static void main(String[] args) {
        Olchuler olchuler = new Olchuler(1700,1800);
        Ekran ekran = new Ekran("Hp","Dyzen","18,5",olchuler);
        Blok blok = new Blok("Shadow","Shadow","Suse");
        Kart kart = new Kart("B250","Asus",14,"Windows");

        Computer computer = new Computer(kart,blok,ekran);
        computer.getBlok().computeri_ac();
        computer.getEkran().close_monitor();
        computer.getKart().main_system_load("Macos");



    }
}
