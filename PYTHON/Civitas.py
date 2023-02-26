from Human import Human

class Civitas (Human):
    # kelas untuk menampung data civitas dan method absen

    # atribut
    __asalUniv = ""
    __emailEdu = ""

    # konstruktor
    def __init__(self):
        self.__asalUniv = ""
        self.__emailEdu = ""
    
    # setter getter
    def setAsalUniversitas(self, asalUniv):
        self.__asalUniv = asalUniv
    def setEmailEdu(self, emailEdu):
        self.__emailEdu = emailEdu

    def getAsalUniversitas(self):
        return self.__asalUniv
    def getEmailEdu(self):
        return self.__emailEdu
    
    # method
    def absen(self):
        print("bang sebut nama")
