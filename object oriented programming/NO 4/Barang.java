package tugasOOP.Ongkir;

public class Barang {
        public float hitungOngkir(int p, int l, int t, float weight){
            int basePrice = 5000;
            int volume = p * l * t;
            float price;

            if(volume <= 50){
                price = basePrice;
                return price;
            } else {
                return basePrice * (volume /50f) * weight;
            }
        }
    }


    