package FinalPublicPrivate;

public class Main {
    public static void main (String[] args){
        System.out.println("test");

        Hero hero1 = new Hero("Ari",100);
        HeroIntel hero2 = new HeroIntel("Julian",105);

        hero1.display();
        hero2.display();

//        System.out.println(hero1.getHealth());
//        System.out.println(hero2.getHealth());

        hero1.setHealth(150);
        hero2.setHealth(90);

        hero1.display();
        hero2.display();

        hero1.setHealth("reset");
        hero2.setHealth("reset");

        hero1.display();
        hero2.display();
    }
}
