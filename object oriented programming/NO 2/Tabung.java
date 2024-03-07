package tugasOOP.BangunDatar;

public class Tabung {
    float a, t, pi;
    public Tabung(float alas, float tinggi){
        this.a = alas;
        this.t = tinggi;
}
    public float volume(){
        return 3.14f*a*a*t;
    }
}
