<?php
# kelas untuk menampung data human dan method makan
class Human {
    // atribut
    private $nik, $nama, $jenisKelamin;

    // konstruktor
    public function __construct() {
        $this->nik = '';
        $this->nama = '';
        $this->jenisKelamin = '';
    }

    // getter and setter
    public function getNik() {
        return $this->nik;
    }

    public function getNama() {
        return $this->nama;
    }

    public function getJenisKelamin() {
        return $this->jenisKelamin;
    }

    public function setNik($nik) {
        $this->nik = $nik;
    }

    public function setNama($nama) {
        $this->nama = $nama;
    }

    public function setJenisKelamin($jenisKelamin) {
        $this->jenisKelamin = $jenisKelamin;
    }

    // method
    public function makan() {
        echo "oke mangan.." . '<br>';
    }
}

?>