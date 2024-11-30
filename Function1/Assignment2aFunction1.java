package Function1;

import java.util.Scanner;

public class Assignment2aFunction1 {
    
    static void  sales (String[] nameFruit, int[][] numberFruit) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nameFruit.length; i++) {
            System.out.print("Fruit " + (i+1) + ": ");
            nameFruit[i] = input.nextLine();
            input.nextLine();
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j+1) + ": ");
                numberFruit[i][j] = input.nextInt();
            }
            System.out.println();
        }
        
    }  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nameFruit = new String[5];
        int[][] numberFruit = new int[5][7];
        sales(nameFruit, numberFruit);
    }
}
