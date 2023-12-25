package oriented;

public class MahasiswaMain {
    public static void main(String[] args) throws Exception{
        Mahasiswa dosen1 = new Mahasiswa();
        dosen1.nama = "Ari Satria Wiratama";
        dosen1.nim = "41519010122";
        dosen1.jurusan = "Teknik Informatika";
        dosen1.umur = 22;


        System.out.println(dosen1.nama);
        System.out.println(dosen1.nim);
        System.out.println(dosen1.jurusan);
        System.out.println(dosen1.umur);
    }
}
