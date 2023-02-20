public class main {
    public static void main(String[] args) {
        // membuat kelas
        Human manusia = new Human();
        Civitas dosen = new Civitas();
        Mhs mahasiswa = new Mhs();

        // menggunakan method dari kelas Human
        // menggunakan setter
        manusia.setNik("0505030002");
        manusia.setNama("Rifqi Fajar");
        manusia.setJenisKelamin("Laki Kali");
        // menggunakan getter
        System.out.println("NIK : " + manusia.getNik());
        System.out.println("Nama : " + manusia.getNama());
        System.out.println("Jenis Kelamin : " + manusia.getJenisKelamin());
        // mencoba method lain
        manusia.makan(); // method dari kelas human
        System.out.println("");

        // menggunakan method dari kelas civitas
        // menggunakan setter dari kelas human
        dosen.setNik("0101020001");
        dosen.setNama("Bintang Fajar");
        dosen.setJenisKelamin("Laki Kali");
        // menggunakan setter dari kelas dosen
        dosen.setAsalUniversitas("UPI Edun");
        dosen.setEmailEdu("bintang.fajar@upi.edu");
        // menggunakan getter dari kelas human
        System.out.println("NIK : " + dosen.getNik());
        System.out.println("Nama : " + dosen.getNama());
        System.out.println("Jenis Kelamin : " + dosen.getJenisKelamin());
        // menggunakan getter dari kelas dosen
        System.out.println("Asal Univ : " + dosen.getAsalUniversitas());
        System.out.println("Email : " + dosen.getEmailEdu());
        // mencoba method lain
        dosen.makan(); // method dari kelas human
        dosen.absen(); // method dari kelas civitas
        System.out.println("");

        // menggunakan method dari kelas mhs
        // menggunakan setter dari kelas human
        mahasiswa.setNik("0303030003");
        mahasiswa.setNama("Ujang Kandil");
        mahasiswa.setJenisKelamin("Laki Kali");
        // menggunakan setter dari kelas civitas
        mahasiswa.setAsalUniversitas("Universitas Anjayani");
        mahasiswa.setEmailEdu("ujang@anjay.edu");
        // menggunakan setter dari kelas mhs
        mahasiswa.setNim("2101103");
        mahasiswa.setFakultas("FPMIPA");
        mahasiswa.setProdi("Ilmu Komputer");
        // menggunakan getter dari kelas human
        System.out.println("NIK : " + mahasiswa.getNik());
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Jenis Kelamin : " + mahasiswa.getJenisKelamin());
        // menggunakan getter dari kelas dosen
        System.out.println("Asal Univ : " + mahasiswa.getAsalUniversitas());
        System.out.println("Email : " + mahasiswa.getEmailEdu());
        // menggunakan getter dari kelas mhs
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Fakultas : " + mahasiswa.getFakultas());
        System.out.println("Program Studi : " + mahasiswa.getProdi());
        // mencoba method lain
        mahasiswa.makan(); // method dari kelas human
        mahasiswa.absen(); // method dari kelas civitas
        mahasiswa.belajar(); // method dari kelas mhs
    }
}
