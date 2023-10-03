public class Date {
    //Variabel instance privat
    private int tahun, bulan, hari;

    //Membuat instance Date dengan tahun, bulan dan hari yang diberikan. 
    public Date (int tahun, int bulan, int hari){
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    //getter atau setter publik untuk variabel privat
    // return tahun
    public int getTahun(){
        return this.tahun;
    }

    //return bulan 
    public int getBulan(){
        return this.bulan;
    } 

    //return hari
    public int getHari(){
        return this.hari;
    }

    //mengatur tahun 
    public void setTahun (int tahun){
        this.tahun = tahun;
    }

    //mengatur bulan 
    public void setBulan (int bulan){
        this.bulan = bulan;
    }

    //mengatur hari  
    public void setHari (int hari){
        this.hari= hari;
    }

    //return string deskriptif dalam format "MM/DD/YYYY" dengan leading zero 
    public String toString (){
        //menggunakan fungsi bawaan string.format() untuk menampilkan string yang diformat
        return String.format("%02d/%02d/%4d", bulan, hari, tahun);
        //spesifier "0" untuk mencetak leading zeros
    }

    //mengatur tahun, bulan, dan hari
    public void setDate (int tahun, int bulan, int hari){
        this.tahun = tahun ;
        this.bulan = bulan;
        this.hari = hari;
    }

}