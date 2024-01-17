package Polymorphisme;

public class HeroStrength extends Hero{
    String type = "Strength";

    HeroStrength(String nama){
        super(nama);
    }

    @Override
    void display(){
        System.out.println();
        super.display();
        System.out.println("Ini adalah :" + this.type);
    }
}
