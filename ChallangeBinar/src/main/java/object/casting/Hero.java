package object.casting;

public class Hero {
    private String name;
    private double health;

    public Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    public double getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setHealth(double newHealth){
        this.health = newHealth;
    }

    //method umum
    public void display(){
        System.out.println(this.name+" mempunyai " + this.health+ " HP");
    }
}
