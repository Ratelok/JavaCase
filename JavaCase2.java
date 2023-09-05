import java.util.Scanner;

public class JavaCase2 {
    public void swapVal(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        JavaCase2 javaCase2 = new JavaCase2();
        javaCase2.swapVal(a, b);
    }
}
