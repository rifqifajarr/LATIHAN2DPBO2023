#include <bits/stdc++.h>
#include "Mhs.cpp"

using namespace std;

int main() {

    // membuat kelas
    Human manusia;
    Civitas dosen;
    Mhs mahasiswa;

    // menggunakan method dari kelas Human
    // menggunakan setter
    manusia.setNik("0505030002");
    manusia.setNama("Rifqi Fajar");
    manusia.setJenisKelamin("Laki Kali");
    // menggunakan getter
    cout << "NIK : " + manusia.getNik() << endl;
    cout << "Nama : " + manusia.getNama() << endl;
    cout << "Jenis Kelamin : " + manusia.getJenisKelamin() << endl;
    // mencoba method lain
    manusia.makan(); // method dari kelas human
    cout << endl;

    // menggunakan method dari kelas civitas
    // menggunakan setter dari kelas human
    dosen.setNik("0101020001");
    dosen.setNama("Bintang Fajar");
    dosen.setJenisKelamin("Laki Kali");
    // menggunakan setter dari kelas dosen
    dosen.setAsalUniversitas("UPI Edun");
    dosen.setEmailEdu("bintang.fajar@upi.edu");
    // menggunakan getter dari kelas human
    cout << "NIK : " + dosen.getNik() << endl;
    cout << "Nama : " + dosen.getNama() << endl;
    cout << "Jenis Kelamin : " + dosen.getJenisKelamin() << endl;
    // menggunakan getter dari kelas dosen
    cout << "Asal Univ : " + dosen.getAsalUniversitas() << endl;
    cout << "Email : " + dosen.getEmailEdu() << endl;
    // mencoba method lain
    dosen.makan(); // method dari kelas human
    dosen.absen(); // method dari kelas civitas
    cout << endl;

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
    cout << "NIK : " + mahasiswa.getNik() << endl;
    cout << "Nama : " + mahasiswa.getNama() << endl;
    cout << "Jenis Kelamin : " + mahasiswa.getJenisKelamin() << endl;
    // menggunakan getter dari kelas dosen
    cout << "Asal Univ : " + mahasiswa.getAsalUniversitas() << endl;
    cout << "Email : " + mahasiswa.getEmailEdu() << endl;
    // menggunakan getter dari kelas mhs
    cout << "NIM : " + mahasiswa.getNim() << endl;
    cout << "Fakultas : " + mahasiswa.getFakultas() << endl;
    cout << "Program Studi : " + mahasiswa.getProdi() << endl;
    // mencoba method lain
    mahasiswa.makan(); // method dari kelas human
    mahasiswa.absen(); // method dari kelas civitas
    mahasiswa.belajar(); // method dari kelas mhs

    return 0;
}
