import java.util.Arrays;

/*Необходимо вывести на экран числа от 1 до 5. На экране должно быть:
1 2 3 4 5*/
public class Cycles_Exercise_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }
        int[] array1 = {1, 2, 3, 4, 5};
            System.out.println();
            System.out.print(Arrays.toString(array1));

/*Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
5 4 3 2 1*/
        System.out.println();
        for (int i = 5; i >= 1; i--){
            System.out.print(i + " ");
        }
        }
    }
