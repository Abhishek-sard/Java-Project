import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter hte second numbers:");
        double secondNumber = scanner.nextDouble();

        scanner.close();
        double sum = firstNumber + secondNumber;
        System.out.println("the sum of " + firstNumber + "and" + secondNumber + "is" + sum);
    }
}
