package AbstractClass;

public class HeroStrength extends Hero{

    HeroStrength(String name){
        super(name);
    }

    @Override
    public void levelUp() {
        setLevel(10);
    }
}
