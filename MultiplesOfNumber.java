package Letcode;

import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        number= sc.nextInt();
        for(int i=1; i<number; i*=4){
            System.out.println("4'ün katları olan sayılar: "+ i);
        }
        System.out.println();
        for(int i=1; i<number; i*=5){
            System.out.println("5 in katları olan sayılar: "+ i);
        }
    }
}
