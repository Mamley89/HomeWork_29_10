package HomeWork_29_10;

public class Branch_3 {
    public static void main(String[] args) {
        Numbers ten = new Numbers();
        ten.Multiple = 99;
        if (ten.Multiple % 2 == 0)
        {
            if (ten.Multiple % 4 == 0)
                {
                System.out.println("Четное число. Кратно четырем.");
                }
            else
                {
                System.out.println("Четное число.");
                }
        }
        else
        {
            if (ten.Multiple % 3 == 0)
                {
                    System.out.println("Нечетное число. Кратно трем.");
                }
            else
                {
                    System.out.println("Нечетное число.");
                }
        }
        }
    }