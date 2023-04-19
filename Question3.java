import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = in.nextInt();
        int ans = n*n;
        System.out.print("Answer: " +ans);
        in.close();
    }
}
