import java.util.Scanner;

/*Существует такая традиция: при приготовлении пельменей
в один из них кладут монетку на счастье.  Считается, что тому,
кому попадется пельмень с монеткой, улыбнется удача.

Представим, что у нас есть кастрюля, в которой лежит 10 пельменей.
Один из них счастливый —  а именно пятый пельмень.
Давайте напишем программу, которая ищет счастливый пельмень.

Программа перебирает пельмени в кастрюле по одному, и когда доходит
до пятого пельменя —  напишет "Вот счастливый пельмень!" и выходит из цикла.*/
public class Pelmeni_Exercise_1 {
    public static void main(String[] args) {
        int a = 0;
        while(a < 10){
            if (a == 4){
                System.out.println("Here is the happy pelmen");
                break;
            }
            a++;
        }
    }
}
