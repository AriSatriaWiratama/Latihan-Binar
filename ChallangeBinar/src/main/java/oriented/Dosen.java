package oriented;

public class Dosen {
    String nama;

    String namaLama = "Rektor Gaming";
    String nim;

    String jurusan;

    Dosen(){
        System.out.println(namaLama);
    }
    Dosen(String nama,String nim,String jurusan){
        this.nama=nama;
        this.nim=nim;
        this.jurusan=jurusan;

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
    }

    // Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama :"+this.nama);
        System.out.println("Nim :"+this.nim);
        System.out.println("Jurusan :"+this.jurusan);
    }

    // Method tanpa return dan dengan parameter
//    void setNama(String nama){
//        this.nama =nama;
//    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }



    String halo(String pesan){
        return pesan +"ini punya"+this.nama;
    }

}
