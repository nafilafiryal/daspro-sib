package Function1;

import java.util.Scanner;

public class Assignment2dFunction1 {
    static void  sales (String[] nameFruit, int[][] numberFruit) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nameFruit.length; i++) {
            System.out.print("Fruit " + (i+1) + ": ");
            nameFruit[i] = input.next();
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j+1) + ": ");
                numberFruit[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            int maxSales = 0;
            String bestFruit = "";
            for (int j = 0; j < nameFruit.length; j++) {
                if (numberFruit[j][i]>maxSales) {
                    maxSales=numberFruit[j][i];
                    bestFruit=nameFruit[j];
                }
            }
            System.out.println("Best selling fruit on day " + (i+1) + ": " + bestFruit + " with " + maxSales + " sold ");
        }
    }  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nameFruit = new String[5];
        int[][] numberFruit = new int[5][7];
        sales(nameFruit, numberFruit);
    }
}
