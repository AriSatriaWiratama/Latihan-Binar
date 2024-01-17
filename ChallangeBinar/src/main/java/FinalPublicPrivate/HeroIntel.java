package FinalPublicPrivate;

public class HeroIntel extends Hero{

    HeroIntel(String name,double health){
        super(name, health);
    }

    void display(){
        System.out.println(this.name + " mempunyai otong "+ getHealth());
    }
}
