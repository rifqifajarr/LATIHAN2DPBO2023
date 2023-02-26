<?php

require('Civitas.php');

class Mhs extends Civitas {
    // attribute
    private $nim, $fakultas, $prodi;
    
    // constructor
    public function __construct() {
        $this->nim = "";
        $this->fakultas = "";
        $this->prodi = "";
    }

    // getter and setter
    public function getNim() {
        return $this->nim;
    }

    public function getFakultas() {
        return $this->fakultas;
    }

    public function getProdi() {
        return $this->prodi;
    }

    public function setNim($nim) {
        $this->nim = $nim;
    }

    public function setFakultas($fakultas) {
        $this->fakultas = $fakultas;
    }

    public function setProdi($prodi) {
        $this->prodi = $prodi;
    }

    // method
    public function belajar() {
        echo "gamau belajar mau nya maen" . '<br>';
    }
}

?>