/**
 * Created by Rafal on 02017-06-16.
 */
public class Recursive {
    static int fibonacci(int i) {
        if (i == 0) return 0;
        else if (i == 1) return 1;
        else return fibonacci(i - 1) + fibonacci(i-2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("fibonacci(" + i + ") = " + fibonacci(i));
        }

    }
}
