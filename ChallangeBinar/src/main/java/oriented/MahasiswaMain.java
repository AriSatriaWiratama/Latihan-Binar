package oriented;

public class MahasiswaMain {
    public static void main(String[] args) throws Exception{
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ari Satria Wiratama";
        mahasiswa1.nim = "41519010122";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.umur = 22;


        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.umur);

        Dosen DosenRektor = new Dosen();
        //membuat object dengan memasukan constructor didalam class
        Dosen dosen1 = new Dosen("Bagus Dwi","10101010","Teknik informatika");

        dosen1.show();
        dosen1.setNama("Titanius Dwi");
        dosen1.show();

        System.out.println(dosen1.getNama());

        String data = dosen1.halo("gg gaming");
        System.out.println(dosen1.halo("beliau"));
        System.out.println(data);
    }
}
