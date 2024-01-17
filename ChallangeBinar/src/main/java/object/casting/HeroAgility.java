package object.casting;

public class HeroAgility extends Hero {
    String type;
    public HeroAgility(String name, double health){
        super(name,health);
        this.type = "Agility";
    }



    @Override
    public void display() {
        System.out.println(getName()+" mempunyai "+getHealth()+" HP Bertipe "+ this.type);
    }
}
