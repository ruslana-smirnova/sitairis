package laba1;

public class Cloak extends RainCoat implements Umbrella, Hood{
    private int size1;
    private int size2;
    private String color_of_cloak;
    public Cloak(int quantity_of_rcoat, int size1, int size2, String color_of_cloak) {
        super(quantity_of_rcoat);
        this.size1 = size1;
        this.size2 = size2;
        this.color_of_cloak = color_of_cloak;
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

    public String getColor_of_cloak() {
        return color_of_cloak;
    }

    public void setColor_of_cloak(String color_of_cloak) {
        this.color_of_cloak = color_of_cloak;
    }

    @Override
    public String brand_of_cloth(String a) {
        a = "Galano";
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
        s1 = "Поларфис";
        System.out.println(s1);
    }

    @Override
    public int number_of_summercloth(int number, int sum) {
        int summerclothes = 0;
        for (int i = number; i <= sum ; i++) {
            summerclothes += 5;
        }
        return summerclothes;
    }

    @Override
    public void open() {
        System.out.println("Umbrella is open ");
    }

    @Override
    public void close() {
        System.out.println("Umbrella is close ");
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
