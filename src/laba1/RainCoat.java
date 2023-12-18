package laba1;

public abstract class RainCoat implements Autumn_Cloth {
    private int quantity_of_rcoat;
    public RainCoat(int quantity_of_rcoat){
        this.quantity_of_rcoat = quantity_of_rcoat;
    }

    public int getQuantity_of_rcoat() {
        return quantity_of_rcoat;
    }

    public void setQuantity_of_rcoat(int quantity_of_rcoat) {
        this.quantity_of_rcoat = quantity_of_rcoat;
    }
}
