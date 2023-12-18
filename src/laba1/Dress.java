package laba1;

public class Dress implements Summer_Cloth{
    private String model;
    private int size1;
    private  int size2;
    public Dress(String model, int size1, int size2){
        this.model = model;
        this.size1 = size1;
        this.size2 = size2;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    @Override
    public int size(int size1, int size2) {
        int averagesize = 0;
        averagesize = (size1 + size2)/2;
        return averagesize;
    }

    @Override
    public int number_of_summercloth(int number, int sum) {
        int summerclothes = 0;
        for (int i = number; i <= sum ; i++) {
            summerclothes += 5;
        }
        return summerclothes;
    }
}
