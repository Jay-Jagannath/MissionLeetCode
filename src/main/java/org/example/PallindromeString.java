package org.example;

import java.util.Scanner;

public class PallindromeString {

    public static void main(String[] args){
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";
        for(int i = str.length()-1 ; i >= 0; i--){
            temp= temp + str.charAt(i);
        }

        if(temp.equalsIgnoreCase(str)){
            System.out.println("The above number IS a pallindrome number");
        }else {
            System.out.println("The above number IS NOT a pallindrome number");
        }
    }
}
