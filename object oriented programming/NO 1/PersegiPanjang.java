package tugasOOP.BangunDatar;

public class PersegiPanjang {
    float p, l;
    public PersegiPanjang(float panjang, float lebar) {
        this.p = panjang;
        this.l = lebar;
    }
    public float luas (){
        return p * l;
    }
    public float keliling () {
        return p + p + l + l;
    }
}


// child class ini butuh nya attribute, constructor, method (fitur untuk menghitung luas), dalam beberapa kasus mungkin gak perlu method.