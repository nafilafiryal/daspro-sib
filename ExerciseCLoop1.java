import java.util.Scanner;

public class ExerciseCLoop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        for ( i = 1; i <= 50; i++) {
            
            if (i%3==0) {
                continue;
                
            } System.out.println(i + " ");
        } System.out.println("stop");
    }
}
