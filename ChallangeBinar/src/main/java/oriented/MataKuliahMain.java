package oriented;

public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah kelas1 = new MataKuliah("Pemprograman Web");
        kelas1.setKelasMatkul(20);
        kelas1.display();
        MataKuliah kelas2 = new MataKuliah("Kalkulus");
        kelas2.setMatkul("Kalkulus Wajib");
        kelas2.setKelasMatkul(5);
        kelas2.display();

        Kantor.kantorMain();
        Kantor kantor1 = new Kantor();
        kantor1.kantorNonStatic();
    }
}
