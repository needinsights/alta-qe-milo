package tugasOOP.Kalkulator;
public class Kalkulator {
    public static void main(String[] args) {

        System.out.print("3 + 4 = ");
        Tambah tambah = new Tambah();
        System.out.println(tambah.tambah(3, 4));

        System.out.print("15 - 4 = ");
        Kurang kurang = new Kurang();
        System.out.println(kurang.kurang(15, 4));

        System.out.print("10 x 10 = ");
        Bagi bagi = new Bagi();
        System.out.println(bagi.bagi(10, 10));

        System.out.print("15 / 4 = ");
        Kali kali = new Kali();
        System.out.println(kali.kali(12, 3));
    }
}

