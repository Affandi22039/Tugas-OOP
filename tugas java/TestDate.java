public class TestDate{
    public static void main(String[] args) {
        //uji konstruktor dan toString()
        Date d1 = new Date(2019,5, 6);
        System.out.println(d1);

        //uji setter dan getter 
        d1.setTahun (2017);
        d1.setBulan (12);
        d1.setHari (23);
        System.out.println(d1);
        System.out.println("Tahun: " + d1.getTahun());
        System.out.println("Bulan: " + d1.getBulan());
        System.out.println("Hari: " + d1.getHari());

        //uji setDate()
        d1.setDate(2015, 3, 4);
        System.out.println(d1);

    }
}