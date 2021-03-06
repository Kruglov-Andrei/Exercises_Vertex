import java.util.Scanner;

/*Представим, что у нас есть загадка: "Что это такое:
синий, большой, с усами и полностью набит зайцами?"
Ответ: троллейбус.

Создайте программу, которая будет считывать с консоли ответ:
- у пользователя есть 3 попытки. После трех ответов программа должна завершиться;
- если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!"
и выходим из цикла;
- если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
- если пользователь вводит любой другой ответ, мы выводим в консоль
"Подумай еще." и продолжаем цикл.*/
public class Riddle_Trolleybus_1 {
    public static void main(String[] args) {
        String answer;
        boolean exit; //переменная для выхода из цикла
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner inputAnswer = new Scanner(System.in);
        exit = false;
        for (int i = 1; i <= 3; i++){ //Считывать нужно не один раз, а три - потому что у нас три попытки.
            if (exit == true) //условие для выхода из цикла
                break;
            answer = inputAnswer.next();
            switch (answer){
                case("Троллейбус"):
                    System.out.println("Правильный ответ!");
                    exit = true;//Переменная exit должна стать true
                    break;
                case ("Сдаюсь"):
                    System.out.println("Правильный ответ - Троллейбус");
                    exit = true;//Переменная exit должна стать true
                    break;
                default:
                    System.out.println("Подумай ещё");
            }
        }
    }
}
