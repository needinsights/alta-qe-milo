package tugasOOP.BangunDatar;
public class bangundatar {
    public static void main(String[] args) {

        System.out.print("Volume Balok: ");
        Balok b1 = new Balok(3, 6, 10);
        System.out.println(b1.volume());

        System.out.print("Volume Kubus: ");
        Kubus k1 = new Kubus(10);
        System.out.println(k1.volume());

        System.out.print("Volume Tabung: ");
        Tabung t1 = new Tabung(7, 10);
        System.out.println(t1.volume());

        System.out.print("luas Persegi: ");
        Persegi p1 = new Persegi(4);
        System.out.println(p1.luas());

        System.out.print("Keliling Persegi: ");
        Persegi p2 = new Persegi(4);
        System.out.println(p1.keliling());

        System.out.print("Luas Persegi Panjang: ");
        PersegiPanjang pp1 = new PersegiPanjang(7,8);
        System.out.println(pp1.luas());

        System.out.print("Keliling Persegi Panjang: ");
        PersegiPanjang pp2 = new PersegiPanjang(7,8);
        System.out.println(pp1.keliling());

        System.out.print("Luas Segitiga: ");
        Segitiga Sg1 = new Segitiga(3,4, 5);
        System.out.println(Sg1.luas());

        System.out.print("Keliling Segitiga biasa: ");
        Segitiga Sg2 = new Segitiga(3,4, 5);
        System.out.println(Sg2.kelilingbiasa());

        System.out.print("Keliling Segitiga sama sisi: ");
        Segitiga Sg3 = new Segitiga(3,4, 5);
        System.out.println(Sg3.kelilingSamasisi());


    }

}


// object duluan
// baru class
//