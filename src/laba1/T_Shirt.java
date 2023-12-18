package laba1;

public abstract class T_Shirt implements Summer_Cloth {
    private String color;
    private int number_of_tshirt;
    public T_Shirt(String color, int number_of_tshirt){
        this.color = color;
        this.number_of_tshirt = number_of_tshirt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber_of_tshirt() {
        return number_of_tshirt;
    }

    public void setNumber_of_tshirt(int number_of_tshirt) {
        this.number_of_tshirt = number_of_tshirt;
    }
}
