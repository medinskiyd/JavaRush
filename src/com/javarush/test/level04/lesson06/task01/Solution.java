package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] firstArray = new int[2];
        int min = 0;

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(bf.readLine());
        }

        min = firstArray[0];

        for (int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] < min){
                min = firstArray[i];
            }
        }
        System.out.println(min);

        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
    }
}