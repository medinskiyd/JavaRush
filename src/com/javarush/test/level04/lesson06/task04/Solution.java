package com.javarush.test.level04.lesson06.task04;

/* �������� �����
������ � ���������� ��� �����, � ���� ����� ���������� ������� ��������� ������ ����������. ���� ����� ������, �� �� ����� ����� � ������� ��������� � ������ ���� ������.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bf.readLine();
        String name2 = bf.readLine();

        if(name1.equals(name2)) {
            System.out.println("����� ���������");
        } else if(name1.length() == name2.length()) {
            System.out.println("����� ���� �����");
        }

    }
}
