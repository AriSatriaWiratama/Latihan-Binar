package FinalPublicPrivate;

public class Hero {
    public String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }
    public double getHealth(){
        return this.health;
    }

    final void setHealth(double newHealth){
        this.health = newHealth;
    }

    //bisa dioverload method
    final void setHealth(String mode){
        if (mode.equals("reset")){
            this.health = 100;
        }
    }

    void display(){
        System.out.println(this.name + " mempunyai "+this.health);
    }
}
