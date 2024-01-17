package object.casting;

public class Main {
    public static void main(String[] args){

        HeroIntel hero1 = new HeroIntel("Julian",100);
        hero1.display();

        //up casting
        Hero heroUp = (Hero) hero1;

        heroUp.display();

        Hero hero2 = new Hero("beliau", 100);

        hero2.display();

        //tidak bisa casting down ke subclass
//        HeroAgility heroDown = (HeroAgility) hero2;
//        heroDown.display();

        HeroIntel heroDown = (HeroIntel) heroUp;

        heroDown.display();
        heroDown.castMagic();
    }
}
