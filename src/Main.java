import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        System.out.println("Enter values");
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();

        }

    }
}