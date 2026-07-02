package PetCenter;

public class Grooming extends Hewan {

    private String paket;

    public Grooming(String nama, int umur, String paket) {
        super(nama, umur);
        this.paket = paket;
    }

    public String getPaket() {
        return paket;
    }

    @Override
    public double hitungBiaya() {

        if(paket.equalsIgnoreCase("Basic")){
            return 75000;
        }

        else if(paket.equalsIgnoreCase("Premium")){
            return 150000;
        }

        return 100000;
    }

}
