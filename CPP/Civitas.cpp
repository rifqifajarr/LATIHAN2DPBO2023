#include <iostream>
#include <string>
#include "Human.cpp"

using namespace std;

class Civitas : public Human {
    // attribute
    private:
        string asalUniversitas, emailEdu;

    // constructor
    public:
    Civitas() {
        this->asalUniversitas = "";
        this->emailEdu = "";
    } 

    Civitas(string asalUniversitas, string emailEdu) {
        this->asalUniversitas = asalUniversitas;
        this->emailEdu = emailEdu;
    }

    // getter and setter
    string getAsalUniversitas() {
        return this->asalUniversitas;
    }

    string getEmailEdu() {
        return this->emailEdu;
    }

    void setAsalUniversitas(string asalUniversitas) {
        this->asalUniversitas = asalUniversitas;
    }

    void setEmailEdu(string emailEdu) {
        this->emailEdu = emailEdu;
    }

    // method
    void absen() {
        cout << "bang sebut nama" << endl;
    }
};
