package TugasETC;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        System.out.println("Masukan Nilai");
        Scanner scan = new Scanner(System.in);
        int nilaisiswa = scan.nextInt();

        if(nilaisiswa<=100 && nilaisiswa>=80)
            System.out.println("A");
        else if(nilaisiswa<=79 && nilaisiswa>=65)
            System.out.println("B+");
        else if(nilaisiswa<=64 && nilaisiswa>=50)
            System.out.println("B");
        else if(nilaisiswa<=49 && nilaisiswa>=35)
            System.out.println("C");
        else if(nilaisiswa<=34 && nilaisiswa>=0)
            System.out.println("D");


        System.out.println(nilaisiswa);










    }

}
