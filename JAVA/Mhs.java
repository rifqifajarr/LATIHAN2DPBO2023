public class Mhs extends Civitas {
    // attribute
    private String nim, fakultas, prodi;
    
    // constructor
    public Mhs() {
        this.nim = "";
        this.fakultas = "";
        this.prodi = "";
    }

    public Mhs(String nim, String fakultas, String prodi) {
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }

    // getter and setter
    public String getNim() {
        return this.nim;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // method
    public void belajar() {
        System.out.println("gamau belajar mau nya maen");
    }
}
