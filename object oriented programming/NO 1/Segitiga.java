package tugasOOP.BangunDatar;

public class Segitiga {
    float a, t, s;
    public Segitiga(float alas, float tinggi, float sisimiring) {
        this.a = alas;
        this.t = tinggi;
        this.s = sisimiring;
    }
    public float luas(){
        return a*t/2;
    }
    public float kelilingSamasisi (){
        return a+s+s;
    }
    public float kelilingbiasa () {
        return a+t+s;
    }
}





