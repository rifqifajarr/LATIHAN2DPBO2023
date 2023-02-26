#include <iostream>
#include <string>
#include "Civitas.cpp"

using namespace std;

class Mhs : public Civitas {
    // attribute
    private:
        string nim, fakultas, prodi;
    
    // constructor
    public:
        Mhs() {
            this->nim = "";
            this->fakultas = "";
            this->prodi = "";
        }

        Mhs(string nim, string fakultas, string prodi) {
            this->nim = nim;
            this->fakultas = fakultas;
            this->prodi = prodi;
        }

        // getter and setter
        string getNim() {
            return this->nim;
        }

        string getFakultas() {
            return this->fakultas;
        }

        string getProdi() {
            return this->prodi;
        }

        void setNim(string nim) {
            this->nim = nim;
        }

        void setFakultas(string fakultas) {
            this->fakultas = fakultas;
        }

        void setProdi(string prodi) {
            this->prodi = prodi;
        }

        // method
        void belajar() {
            cout << "gamau belajar mau nya maen" << endl;
        }
};
