package laba1;

public class Sheepskin extends Jacket implements Hood{
    private String fabric;
    public Sheepskin(int quantity_of_jackets, String color_of_jackets, int size1, int size2, String fabric) {
        super(quantity_of_jackets, color_of_jackets, size1, size2);
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
