public class TestTime {
    public static void main(String[]args){
        //uji konstruktor dan toString()
        Time w1 = new Time (1, 2, 3); //toString()
        System.out.println(w1);

        Time w2 = new Time(); //konstruktor default
        System.out.println(w2);

        //uji setter dan getter
        w1.setJam(3);
        w1.setMenit(2);
        w1.setDetik(7);
        System.out.println(w1); //menjalankan toString()untuk memeriksa instansi yang sudah dimodifikasi 
        System.out.println("Jam adalah : " + w1.getJam());
        System.out.println("Menit adalah : " + w1.getMenit());
        System.out.println("Detik adalah :" + w1.getDetik());

        //uji setTime()
        w1.setTime(41, 39, 20);
        System.out.println(w1);

        //uji detik Berikutnya() dan berantai
        System.out.println(w1.detikBerikutnya()); //mengembalikan instance Time. memanggil toString() dari Time
        System.out.println(w1.detikBerikutnya().detikBerikutnya().detikBerikutnya()); //berantai 
    }
}