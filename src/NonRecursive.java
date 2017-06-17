/**
 * Created by Rafal on 02017-06-16.
 */
public class NonRecursive {

    static int fibonacci(int i) {
        int prevprev = 0;
        int prev = 1;
        int current = prevprev + prev;
        if (i == 0) return prevprev;
        else if (i == 1) return prev;
        else {
            for (int j = 2; j <= i; j++) {
                current = prevprev + prev;
                prevprev = prev;
                prev = current;
            }
        }
        return current;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            System.out.println("fibonacci(" + i + ") = " + fibonacci(i));
        }
    }
}
