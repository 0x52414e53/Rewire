import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int numTerms = input.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Sequence: " + firstTerm + ", " + secondTerm);

        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        input.close();
	}
}
