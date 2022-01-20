/*Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.*/

import java.util.Scanner;

public class Cycles_Exercise_4_Sum_Scan {
    public static void main(String[] args) {
        int a;
        System.out.println("Please, enter the number");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            a = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= a; i++){
                sum = sum + i;
            }
            System.out.println("The total sum of the numbers from 1 to " + a + " is " + sum);
        }
        else{
            System.out.println("The number is not correct");
        }
        }
}
