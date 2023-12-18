package laba1;

public class Jacket implements Hood, Winter_Cloth{
    private int quantity_of_jackets;
    private String color_of_jackets;
    private int size1;
    private  int size2;
    public Jacket(int quantity_of_jackets, String color_of_jackets, int size1, int size2){
        this.quantity_of_jackets = quantity_of_jackets;
        this.color_of_jackets = color_of_jackets;
        this.size1 = size1;
        this.size2 = size2;
    }

    public int getSize1() {
        return size1;
    }

    public void setSize1(int size1) {
        this.size1 = size1;
    }

    public int getSize2() {
        return size2;
    }

    public void setSize2(int size2) {
        this.size2 = size2;
    }

    public int getQuantity_of_jackets() {
        return quantity_of_jackets;
    }

    public void setQuantity_of_jackets(int quantity_of_jackets) {
        this.quantity_of_jackets = quantity_of_jackets;
    }

    public String getColor_of_jackets() {
        return color_of_jackets;
    }

    public void setColor_of_jackets(String color_of_jackets) {
        this.color_of_jackets = color_of_jackets;
    }

    @Override
    public String brand_of_cloth(String a) {
        a = "North Face";
        return a;
    }

    @Override
    public int size(int size1, int size2) {
        int averagesize = 0;
        averagesize = (size1 + size2)/2;
        return averagesize;
    }

    @Override
    public void put_on() {
        System.out.println("Hood is put on ");

    }

    @Override
    public void put_off() {
        System.out.println("Hood is put off ");
    }

    @Override
    public void getFabric_of_Cloth(String s1) {
             s1 = "Полиэстр";
             System.out.println(s1);
    }

    @Override
    public int level_of_warm(int temp) {
        int templevel = 0;
        if (temp <= -10){
            templevel = 3; }
        else if (temp <= 0) {
            templevel = 2;
        }
        else if (temp <= 10){
            templevel = 1;
        }
        else templevel = 0;

        return templevel;
    }
}
