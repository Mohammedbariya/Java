
import java.util.Scanner;
public class Percentage_Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the percentage calculator");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of subject number 1: ");
        float as = s.nextInt();

        System.out.println("Enter the marks of subject number 2: ");
        float bs = s.nextInt();

        System.out.println("Enter the marks of subject number 3: ");
        float cs = s.nextInt();

        System.out.println("Enter the marks of subject number 4: ");
        float ds = s.nextInt();

        System.out.println("Enter the marks of subject number 5: ");
        float es = s.nextInt();

        System.out.println("Enter Total marks: ");
        float fs = s.nextInt();

        float w = as+bs+cs+ds+es;
        float t = (w/fs)*100;

        System.out.println("The percentage of your marks is: ");
        System.out.println(t);

    }
}
