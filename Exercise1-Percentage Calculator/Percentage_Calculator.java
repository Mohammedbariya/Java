
import java.util.Scanner;
public class Percentage_Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the percentage calculator");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of subject number 1: ");
//        Scanner a = new Scanner(System.in);
        float as = s.nextInt();

        System.out.println("Enter the marks of subject number 2: ");
//        Scanner b = new Scanner(System.in);
        float bs = s.nextInt();

        System.out.println("Enter the marks of subject number 3: ");
//        Scanner c = new Scanner(System.in);
        float cs = s.nextInt();

        System.out.println("Enter the marks of subject number 4: ");
//        Scanner d = new Scanner(System.in);
        float ds = s.nextInt();

        System.out.println("Enter the marks of subject number 5: ");
//        Scanner e = new Scanner(System.in);
        float es = s.nextInt();

        System.out.println("Enter Total marks: ");
//        Scanner f = new Scanner(System.in);
        float fs = s.nextInt();

        float w = as+bs+cs+ds+es;
        float t = (w/fs)*100;

        System.out.println("The percentage of your marks is: ");
        System.out.println(t);

    }
}
