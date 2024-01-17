package Polymorphisme;

public class Main {
    public static void main (String[] args){
        Hero heroMain = new Hero("Beliau");
        HeroStrength heroStrength = new HeroStrength("Mamang garox");
        heroMain.display();
        heroStrength.display();
        HeroAgility heroAgility = new HeroAgility("Kimochi");
        heroAgility.display();
        HeroIntel heroIntel = new HeroIntel("Marsupilami");
        heroIntel.display();

        //Polymorphic
        Hero heroPStrength = new HeroStrength("Kimochi");
        heroPStrength.display();

        //Array List
        Hero[] kumpulanHero = new Hero[6];
        kumpulanHero[0] = heroMain;
        kumpulanHero[1] = heroIntel;
        kumpulanHero[2] = heroAgility;
        kumpulanHero[4] = heroStrength;
        kumpulanHero[5] = heroPStrength;

        kumpulanHero[5].display();
    }
}
