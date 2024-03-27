package lesson12;

public class Car {

    //public -her yerde bir basha chagrilib istifade edile biler
    //private - yalniz oz clasi daxilindi bir basha istifade edilir
    // encapsulation ile diger classlarda istifade edilir

    private String model;
    private int year;
    private String color;

    // Bank sistemi ;
    // accountnumber,name,surname,mail,balans
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
