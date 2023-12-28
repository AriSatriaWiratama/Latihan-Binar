package oriented;

import java.util.ArrayList;
import java.util.Arrays;

public class MataKuliah {
    private String matkul;
    private int kelasMatkul;

    private ArrayList<String> allMatkul = new ArrayList<String>();


    public MataKuliah(String addName){
        this.matkul = addName;
        this.kelasMatkul = 0;
        this.allMatkul.add(this.matkul);
    }

    public int getKelasMatkul(){
        return this.kelasMatkul;
    }

    public void setKelasMatkul(int setKelas){
        this.kelasMatkul = setKelas;
    }

//    public void setMatkul(String setMatkul){
//        this.matkul= setMatkul;
//    }


    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public void display(){
        System.out.println(this.matkul);
        System.out.println(this.kelasMatkul);
    }

    public ArrayList<String> getAllMatkul(){
        return this.allMatkul;
    }
}
