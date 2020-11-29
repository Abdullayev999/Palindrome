package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Определить является ли строка палиндромом.

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        boolean check = true;
        int size = str.length();

        if (size % 2 == 0)
        {
            for (int i = 0 ,j = size-1; i<j ; i++,j--) {
                if (str.charAt(i)!=str.charAt(j)){
                    check = false;
                    break;
                }
            }
        }
        else
        {
            for (int i = 0,j = size-1; i <= size/2 ; i++,j--) {
                if (str.charAt(i)!=str.charAt(j)){
                    check = false;
                    break;
                }
            }
        }

        System.out.print(str + "  -  This word is ");

        if (check)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");


    }
}
