package Function1;

import java.util.Scanner;

public class Assignment2aFunction1 {
    
    static void  sales (String[] nameFruit, int[][] fruit) {
        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i+1) + ": ");
            for (int j = 0; j < nameFruit.length; j++) {
                System.out.println(nameFruit[j] + ": " + fruit[j][i]);
            }
            System.out.println();
        }
        
    }  
    public static void main(String[] args) {
        String[] nameFruit = {"Apple", "Orange", "Grape", "Kiwi", "Guava"
        };
        int[][] fruit={
            {20, 19, 25, 20, 10, 0, 10},
            {30, 30, 40, 10, 15, 20, 25},
            {5, 0, 20, 25, 10, 5, 45},
            {50, 0, 7, 8, 0, 30, 60},
            {15, 10, 16, 15, 10, 10, 5}
        };
        sales(nameFruit, fruit);
    }
}
