package Function1;

import java.util.Scanner;

public class Assignment2bFunction1 {
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
        for (int i = 0; i < nameFruit.length; i++) {
            System.out.println("Fruit " + (i+1) + ": " + nameFruit[i]);
            for (int j = 0; j < numberFruit[i].length; j++) {
                System.out.println("Day " + (j+1)+": "+numberFruit[i][j]);
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
