package TugasETC;

import Motor.MotorBMW;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nomor = scan.nextInt();

        MotorBMW motorKerenMilo = new MotorBMW("BMWBiru", 15000);

        scan.nextLine();
        for (int i = nomor; i > 0; i--) {
            if(nomor%i==0) {
                System.out.println(i);

            }


    }




    }
}


