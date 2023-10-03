/* Kelas Lingkaran (Semua kode sumber dalam satu file) (LingkaranAIO.cpp) */
#include <iostream>    // menggunakan fungsi-fungsi IO
#include <string>      // menggunakan string
using namespace std;
 
class Lingkaran {
private:
   double jariJari;   // Anggota data (Variabel)
   string warna;      // Anggota data (Variabel)
 
public:
   // Konstruktor dengan nilai default untuk anggota data
   Lingkaran(double r = 1.0, string w = "Merah") {
      jariJari = r;
      warna = w;
   }
 
   double dapatJariJari() {  // Fungsi anggota (Getter)
      return jariJari;
   }
 
   string dapatWarna() {     // Fungsi anggota (Getter)
      return warna;
   }
 
   double dapatLuas() {      // Fungsi anggota
      return jariJari*jariJari*3.1416;
   }
};   // perlu mengakhiri deklarasi kelas dengan titik koma
 
// Fungsi pengujian
int main() {
   // Membuat instance Lingkaran
   Lingkaran L1(4.0, "Biru");
   cout << "Jari-Jari=" << L1.dapatJariJari() << " Luas=" << L1.dapatLuas()
        << " Warna=" << L1.dapatWarna() << endl;
 
   // Membuat instance Lingkaran lainnya
   Lingkaran L2(4.0); // warna default
   cout << "Jari-Jari=" << L2.dapatJariJari() << " Luas=" << L2.dapatLuas()
        << " Warna=" << L2.dapatWarna() << endl;
 
   // Membuat instance Lingkaran menggunakan konstruktor default tanpa argumen
   Lingkaran L3;      // jari-jari dan warna default
   cout << "Jari-Jari=" << L3.dapatJariJari() << " Luas=" << L3.dapatLuas()
        << " Warna=" << L3.dapatWarna() << endl;
   return 0;
}