package laba1;

public class ShowCloth {
    public static void main(String[] args) {
        T_Shirt t_shirtWithSleeves = new T_Shirt_with_Sleeves("black", 30, 23);
        T_Shirt t_shirtWithOutSleeves = new T_Shirt_without_Sleeves("blue", 17, 15);
        Dress dress = new Dress("Классическое",40, 42);
        RainCoat raincloak = new Cloak(11, 42,44, "white");
        Jacket jacket = new Jacket(34, "yellow", 46, 50);
        Sheepskin sheepskin = new Sheepskin(22, "brown", 50, 52, "skin");
        System.out.println("Футболка с рукавами: " + '\n' + "Общее количество футболок: " +
                t_shirtWithSleeves.number_of_summercloth(8,16) +
                '\n' + "Средний размер футболки: " + t_shirtWithSleeves.size(40,42) + '\n'
                + "Количество футболок с рукавами: " +
                t_shirtWithSleeves.getNumber_of_tshirt() + '\n' + "Цвет футболок: " +
                t_shirtWithSleeves.getColor());
        System.out.println("Футболка без рукавов " +  '\n' + "Общее количество футболок: " +
                t_shirtWithOutSleeves.number_of_summercloth(7,17) +
                '\n' + "Средний размер футболки: " + t_shirtWithOutSleeves.size(44,46) + '\n' +
               "Количество футболок без рукавов " + t_shirtWithOutSleeves.getNumber_of_tshirt()  +
                '\n' + "Цвет футболок: " + t_shirtWithOutSleeves.getColor());
        System.out.println("Платья " + dress.getModel() + '\n' + "Средний размер платьев: " +
                dress.size(40,42) + '\n' + "Общее количество платьев: "
                + dress.number_of_summercloth(12,22));
        System.out.println("Плащи " + raincloak.brand_of_cloth("Galano") + '\n' + "Средний размер плащей: " +
                 raincloak.size(46,50) + '\n' + "Количество плащей: " + raincloak.getQuantity_of_rcoat());
        System.out.println("Куртки " + jacket.brand_of_cloth("North Face") + '\n' + "Уровень тепла: " +
                jacket.level_of_warm(5) +
               '\n' + "Средний размер куртки: " + jacket.size(46,50));
        jacket.getFabric_of_Cloth("Полиэстр");
        System.out.println("Дублёнка " + sheepskin.brand_of_cloth("Brioni") + '\n' +
                "Тип ткани дублёнки: "+ sheepskin.getFabric() +
                '\n' + "Средний размер дублёнок: " + sheepskin.size(50,52) + '\n' + "Уровень тепла: "
                        + sheepskin.level_of_warm(-7) + '\n' + "Цвет дублёнок: "
                + sheepskin.getColor_of_jackets() + '\n' + "Количество дублёнок: " +
                        sheepskin.getQuantity_of_jackets());
    }
}
