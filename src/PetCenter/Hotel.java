package PetCenter;

public class Hotel extends Hewan {

    private int lamaInap;

    public Hotel(String nama, int umur, int lamaInap) {
        super(nama, umur);
        this.lamaInap = lamaInap;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    @Override
    public double hitungBiaya() {

        double total = lamaInap * 50000;

        if(lamaInap > 7){
            total -= total * 0.10;
        }

        return total;
    }

}
