from Human import Human
from Civitas import Civitas
from Mhs import Mhs

manusia = Human()
dosen = Civitas()
mahasiswa = Mhs()

# menggunakan method dari kelas Human
# menggunakan setter
manusia.setNik("0505030002")
manusia.setNama("Rifqi Fajar")
manusia.setJenisKelamin("Laki Kali")
# menggunakan getter
print("NIK : " + manusia.getNik())
print("Nama : " + manusia.getNama())
print("Jenis Kelamin : " + manusia.getJenisKelamin())
# mencoba method lain
manusia.makan() # method dari kelas human
print("===========================")

# menggunakan method dari kelas civitas
# menggunakan setter dari kelas human
dosen.setNik("0101020001")
dosen.setNama("Bintang Fajar")
dosen.setJenisKelamin("Laki Kali")
# menggunakan setter dari kelas dosen
dosen.setAsalUniversitas("UPI Edun")
dosen.setEmailEdu("bintang.fajar@upi.edu")
# menggunakan getter dari kelas human
print("NIK : " + dosen.getNik())
print("Nama : " + dosen.getNama())
print("Jenis Kelamin : " + dosen.getJenisKelamin())
# menggunakan getter dari kelas dosen
print("Asal Univ : " + dosen.getAsalUniversitas())
print("Email : " + dosen.getEmailEdu())
# mencoba method lain
dosen.makan() # method dari kelas human
dosen.absen() # method dari kelas civitas
print("===========================")

# menggunakan method dari kelas mhs
# menggunakan setter dari kelas human
mahasiswa.setNik("0303030003")
mahasiswa.setNama("Ujang Kandil")
mahasiswa.setJenisKelamin("Laki Kali")
# menggunakan setter dari kelas civitas
mahasiswa.setAsalUniversitas("Universitas Anjayani")
mahasiswa.setEmailEdu("ujang@anjay.edu")
# menggunakan setter dari kelas mhs
mahasiswa.setNim("2101103")
mahasiswa.setFakultas("FPMIPA")
mahasiswa.setProdi("Ilmu Komputer")
# menggunakan getter dari kelas human
print("NIK : " + mahasiswa.getNik())
print("Nama : " + mahasiswa.getNama())
print("Jenis Kelamin : " + mahasiswa.getJenisKelamin())
# menggunakan getter dari kelas dosen
print("Asal Univ : " + mahasiswa.getAsalUniversitas())
print("Email : " + mahasiswa.getEmailEdu())
# menggunakan getter dari kelas mhs
print("NIM : " + mahasiswa.getNim())
print("Fakultas : " + mahasiswa.getFakultas())
print("Program Studi : " + mahasiswa.getProdi())
# mencoba method lain
mahasiswa.makan() # method dari kelas human
mahasiswa.absen() # method dari kelas civitas
mahasiswa.belajar() # method dari kelas mhs