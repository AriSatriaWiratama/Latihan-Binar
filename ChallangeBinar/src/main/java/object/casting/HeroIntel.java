package object.casting;

public class HeroIntel extends Hero{
    String type;
    public HeroIntel(String name, double health){
        super(name,health);
        this.type = "intel";
    }

    void castMagic(){
        System.out.println("mengeluarkan magic");
    }

    @Override
    public void display() {
        System.out.println(getName()+" mempunyai "+getHealth()+" HP Bertipe "+ this.type);
    }
}
