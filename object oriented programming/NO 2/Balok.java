package tugasOOP.BangunDatar;

public class Balok {

    float p, l ,t;

    public Balok (float panjang, float lebar, float tinggi){
        this.p = panjang;
        this.l = lebar;
        this.t = tinggi;
    }

    public float volume(){
        return p*l*t;


    }
}
