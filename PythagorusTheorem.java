import java.util.Scanner;
public class PythagorusTheorem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();
        c = Math.pow(a, 2) + Math.pow(b, 2);
        System.out.println("Length of the hypotenuse = " + Math.sqrt(c));
        scanner.close();
    }
}