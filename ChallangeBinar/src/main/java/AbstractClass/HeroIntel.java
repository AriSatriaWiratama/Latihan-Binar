package AbstractClass;

public class HeroIntel extends Hero{

    HeroIntel(String name){
        super(name);
    }


    public void levelUp() {
        setLevel(1);
    }
}
