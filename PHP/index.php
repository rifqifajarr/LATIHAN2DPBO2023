<?php

// require('Human.php');
// require('Civitas.php');
require('Mhs.php');

// membuat kelas
$manusia = new Human();
$dosen = new Civitas();
$mahasiswa = new Mhs();

// menggunakan method dari kelas Human
// menggunakan setter
$manusia->setNik("0505030002");
$manusia->setNama("Rifqi Fajar");
$manusia->setJenisKelamin("Laki Kali");
// menggunakan getter
echo "NIK : " . $manusia->getNik() . '<br>';
echo "Nama : " . $manusia->getNama() . '<br>';
echo "Jenis Kelamin : " . $manusia->getJenisKelamin() . '<br>';
// mencoba method lain
$manusia->makan(); // method dari kelas human
echo '<br>' . '<br>';

// menggunakan method dari kelas civitas
// menggunakan setter dari kelas human
$dosen->setNik("0101020001");
$dosen->setNama("Bintang Fajar");
$dosen->setJenisKelamin("Laki Kali");
// menggunakan setter dari kelas dosen
$dosen->setAsalUniversitas("UPI Edun");
$dosen->setEmailEdu("bintang.fajar@upi.edu");
// menggunakan getter dari kelas human
echo "NIK : " . $dosen->getNik() . '<br>';
echo "Nama : " . $dosen->getNama() . '<br>';
echo "Jenis Kelamin : " . $dosen->getJenisKelamin() . '<br>';
// menggunakan getter dari kelas dosen
echo "Asal Univ : " . $dosen->getAsalUniversitas() . '<br>';
echo "Email : " . $dosen->getEmailEdu() . '<br>';
// mencoba method lain
$dosen->makan(); // method dari kelas human
$dosen->absen(); // method dari kelas civitas
echo '<br>' . '<br>';

// menggunakan method dari kelas mhs
// menggunakan setter dari kelas human
$mahasiswa->setNik("0303030003");
$mahasiswa->setNama("Ujang Kandil");
$mahasiswa->setJenisKelamin("Laki Kali");
// menggunakan setter dari kelas civitas
$mahasiswa->setAsalUniversitas("Universitas Anjayani");
$mahasiswa->setEmailEdu("ujang@anjay.edu");
// menggunakan setter dari kelas mhs
$mahasiswa->setNim("2101103");
$mahasiswa->setFakultas("FPMIPA");
$mahasiswa->setProdi("Ilmu Komputer");
// menggunakan getter dari kelas human
echo "NIK : " . $mahasiswa->getNik() . '<br>';
echo "Nama : " . $mahasiswa->getNama() . '<br>';
echo "Jenis Kelamin : " . $mahasiswa->getJenisKelamin() . '<br>';
// menggunakan getter dari kelas dosen
echo "Asal Univ : " . $mahasiswa->getAsalUniversitas() . '<br>';
echo "Email : " . $mahasiswa->getEmailEdu() . '<br>';
// menggunakan getter dari kelas mhs
echo "NIM : " . $mahasiswa->getNim() . '<br>';
echo "Fakultas : " . $mahasiswa->getFakultas() . '<br>';
echo "Program Studi : " . $mahasiswa->getProdi() . '<br>';
// mencoba method lain
$mahasiswa->makan(); // method dari kelas human
$mahasiswa->absen(); // method dari kelas civitas
$mahasiswa->belajar(); // method dari kelas mhs

?>