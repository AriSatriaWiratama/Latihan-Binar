package Polymorphisme;

public class HeroAgility extends Hero{
    String type = "Agility";

    HeroAgility(String nama){
        super(nama);
    }

    @Override
    void display(){
        System.out.println();
        super.display();
        System.out.println("Ini adalah :" + this.type);
    }
}
