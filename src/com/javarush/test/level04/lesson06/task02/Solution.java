package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] firstArray = new int[4];
        int max = 0;

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(bf.readLine());
        }

        for (int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] > max){
                max = firstArray[i];
            }
        }
        System.out.println(max);

    }
}
