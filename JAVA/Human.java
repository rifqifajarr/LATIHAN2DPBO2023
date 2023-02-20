public class Human {
    // attribute
    private String nik, nama, jenisKelamin;
    
    // constructor
    public Human() {
        this.nik = "";
        this.nama = "";
        this.jenisKelamin = "";
    }

    public Human(String nik, String nama, String jenisKelamin) {
        this.nik = nik;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    // getter and setter
    public String getNik() {
        return this.nik;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // method
    public void makan() {
        System.out.println("oke mangan..");
    }
}
