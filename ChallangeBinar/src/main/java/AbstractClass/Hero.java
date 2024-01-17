package AbstractClass;

public abstract class Hero {
    private String nama;

    private int level;

    Hero(String nama){
        this.nama = nama;
        this.level = 1;
    }

    void display(){
        System.out.println("Aku adalah " + this.nama);
        System.out.println("Levelnya adalah " + this.level);
    }

    public abstract void levelUp();

    public void setLevel(int deltaLevel){
        this.level += deltaLevel;
    }
}
