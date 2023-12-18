package laba1;

public class T_Shirt_without_Sleeves extends T_Shirt{
    private int number_of_without;
    public T_Shirt_without_Sleeves(String color, int number_of_tshirt, int number_of_without) {
        super(color, number_of_tshirt);
        this.number_of_without = number_of_without;
    }

    public int getNumber_of_without() {
        return number_of_without;
    }

    public void setNumber_of_without(int number_of_without) {
        this.number_of_without = number_of_without;
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
