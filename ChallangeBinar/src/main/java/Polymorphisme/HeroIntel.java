package Polymorphisme;

public class HeroIntel extends Hero{

    String type = "Intel";

    HeroIntel(String nama) {
        super(nama);
    }

    @Override
    void display(){
        System.out.println();
        super.display();
        System.out.println("Ini adalah :" + this.type);
    }
}
