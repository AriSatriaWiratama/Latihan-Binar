package AbstractClass;



public class Main {
    public static void main(String[] args){

        HeroIntel hero1 = new HeroIntel("Beliau");
        HeroAgility hero2 = new HeroAgility("Mamang");
        hero1.display();
        hero2.display();

        hero1.levelUp();
        hero2.levelUp();

        hero1.display();
        hero2.display();

        HeroStrength hero3 = new HeroStrength("bambang");
        hero3.levelUp();

        hero3.display();
    }
}
