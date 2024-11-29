package Function1;

public class Assignment1 {
    static void evenNumber() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
    public static void main(String[] args) {
        evenNumber();
    }
}
