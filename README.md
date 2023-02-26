# LATIHAN2DPBO2023

untuk latihan 2 kali ini, ada 3 kelas sebagai berikut :
1. Human
- atribut : NIK, nama, dan jenisKelamin
- getter dan setter untuk setiap atribut
- method makan
2. Civitas extend Human
- atribut : asalUniversitas dan emailEdu
- getter dan setter untuk setiap atribut
- method absen
3. Mhs extend Civitas
- atribut : NIM, fakultas, dan prodi
- getter dan setter untuk setiap atribut
- method belajar

saya menjadikan Human sebagai base class karena kelas Civitas dan Mhs memiliki atribut yang dimiliki oleh Human, lalu Civitas sebagai anak dari kelas Human, dan terakhir Mhs anak dari kelas Civitas, Mhs dijadikan cucu karena lebih spesifik daripada civitas karena Mhs juga bisa memiliki atribut asalUniversitas dan emailEdu sementara Civitas belum tentu memiliki NIM.

Untuk method makan, absen, belajar hanya sebagai contoh untuk menunjukan apakah bisa dipakai di kelas anak nya selain getter dan setter.
