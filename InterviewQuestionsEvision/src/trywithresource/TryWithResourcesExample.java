package trywithresource;
import java.util.Scanner;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println("You entered: " + number);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}



