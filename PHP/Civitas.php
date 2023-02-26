<?php

require('Human.php');

class Civitas extends Human {
    // attribute
    private $asalUniversitas, $emailEdu;

    // constructor
    public function __construct() {
        $this->asalUniversitas = "";
        $this->emailEdu = "";
    }

    // getter and setter
    public function getAsalUniversitas() {
        return $this->asalUniversitas;
    }

    public function getEmailEdu() {
        return $this->emailEdu;
    }

    public function setAsalUniversitas($asalUniversitas) {
        $this->asalUniversitas = $asalUniversitas;
    }

    public function setEmailEdu($emailEdu) {
        $this->emailEdu = $emailEdu;
    }

    // method
    public function absen() {
        echo "bang sebut nama" . '<br>';
    }
}


?>