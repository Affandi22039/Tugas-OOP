public class TestAccount {
   public static void main(String[] args) {
      // uji Constructors and toString()
      Account a1 = new Account(2345);
      System.out.println(a1);
      //Account[number=2345,balance=$0.00]
      Account a2 = new Account(1234, 89.9);
      System.out.println(a2);
      //Account[number=1234,balance=$89.90]

      // uji getters
      System.out.println("Nomor accountnya adalah: " + a2.getNomor());
      //Nomor akunya adalah: 1234
      System.out.println("Saldonya adalah: " + a2.getSaldo());
      //Saldonya adalah: 89.9

      // uji kredit(), debit() and transferKe()
      a1.kredit(11.1);
      System.out.println(a1);
      //Account[nomor=2345,saldo=$11.10]
      a1.debit(5.5);
      System.out.println(a1);
      //Account[nomor=2345,saldo=$5.60]
      a1.debit(500);   // uji debit() error
      //amount exceeded
      System.out.println(a1);
      //Account[nomor=2345,saldo=$5.60]

      a2.transferKe(1.0, a1);
      System.out.println(a1);
      //Account[nomor=2345,saldo=$6.60]
      System.out.println(a2);
      //Account[nomor=1234,saldo=$88.90]
    }
}