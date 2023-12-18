package laba1;

public class T_Shirt_with_Sleeves extends T_Shirt{
    private int number_of_with_sleeves;
    public T_Shirt_with_Sleeves(String color, int number_of_tshirt, int number_of_with_sleeves) {
        super(color, number_of_tshirt);
        this.number_of_with_sleeves = number_of_with_sleeves;
    }

    public int getNumber_of_with_sleeves() {
        return number_of_with_sleeves;
    }

    public void setNumber_of_with_sleeves(int number_of_with_sleeves) {
        this.number_of_with_sleeves = number_of_with_sleeves;
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
