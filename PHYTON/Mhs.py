from Civitas import Civitas

class Mhs (Civitas):
    # kelas untuk menampung data mhs dan method belajar

    # atribut
    __nim = ""
    __fakultas = ""
    __prodi = ""

    # konstruktor
    def __init__(self):
        self.__nim = ""
        self.__fakultas = ""
        self.__prodi = ""

    # setter getter
    def setNim(self, nim):
        self.__nim = nim
    def setFakultas(self, fakultas):
        self.__fakultas = fakultas
    def setProdi(self, prodi):
        self.__prodi = prodi
    
    def getNim(self):
        return self.__nim
    def getFakultas(self):
        return self.__fakultas
    def getProdi(self):
        return self.__prodi
    
    # method
    def belajar(selfs):
        print("gamau belajar mau nya maen")
