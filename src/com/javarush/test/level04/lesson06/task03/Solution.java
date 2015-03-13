package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] firstArray = new int[3];


        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(bf.readLine());
        }

        for (int j = 0; j < firstArray.length-1; j++) {
            for (int i = 0; i < firstArray.length-1; i++) {
                int k = i+1;
                if (firstArray[i] < firstArray[k]) {
                    int tmp = firstArray[i];
                    firstArray[i] = firstArray[k];
                    firstArray[k] = tmp;
                }
            }
        }
        for (int j = 0; j < firstArray.length; j++) {
            System.out.println(firstArray[j]);
        }

        bf.close();
    }

}
