import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in); /** initialise to read input */
    System.out.print("Enter height(m): ");
    double height = in.nextDouble();
    System.out.print("Enter weight(m): "); /** ask for input */
    double weight = in.nextDouble(); /** read the input */
    double BMI = weight / (height * height); /** calculate BMI */
    System.out.print("BMI is " +BMI );
    }
}
