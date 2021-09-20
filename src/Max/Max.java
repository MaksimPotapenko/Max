/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Max;

import java.util.Scanner;

/**
 *
 * @author Mad Max
 */
public class Max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Перевод Цельсия в Фаренгейт");
        System.out.print("Введите температуру в Цельсиях: ");
        int celsius = scanner.nextInt();
        int farenheit = (celsius*9/5)+32;
        System.out.printf("Температура в Фаренгейтах: %d%n", farenheit);
        System.out.println("____________________________");
        System.out.println("Разбор числа");
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int ones = (number%10);
        int tens = (number/10)%10;
        int hundreds =(number/100);
        int summ=(ones+tens+hundreds);
        System.out.printf("Сотни: %d%n", hundreds);
        System.out.printf("Десятки: %d%n", tens);
        System.out.printf("Единицы: %d%n", ones);
        System.out.printf("Сумма: %d%n",summ);
        
    }
    
}
