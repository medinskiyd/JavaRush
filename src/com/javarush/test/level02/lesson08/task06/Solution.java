package com.javarush.test.level02.lesson08.task06;

/* ����� ������ �� �����
�������� �������, ������� ������� ���������� ������ (�����) �� ����� ��� ����, �� � ����� ������.
����� ������ ���� ��������� �������� � �� ������ ��������� � ����.
*/
public class Solution
{
    public static void print3(String s)
    {
        for(int i = 0; i < 3; i++){
            System.out.print(s + " ");

        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        print3("�����������");
        print3("����");
        print3(" �����");

/* ����� �� ����� ������ ���� ���������:
����������� ����������� �����������
���� ���� ����
 �����  �����  �����
*/
    }
}