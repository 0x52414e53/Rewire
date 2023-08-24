import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); //declares the scanner name
		
		int numOne, numTwo,result;
		String sign;
		
		System.out.print("Enter Number One :");
		numOne = input.nextInt();
		System.out.print("Choose Operator : + - * / % ");
		sign = input.next();
		System.out.print("Enter Number Two: ");
		numTwo = input.nextInt();
		switch(sign){
		    case "+":
		        result = numOne + numTwo;
		        break;
		    case "-":
		        result = numOne - numTwo;
		        break;
		    case "*":
		        result = numOne * numTwo;
		        break;
		    case "/":
		        result = numOne / numTwo;
		        break;
		    default:
		        System.out.println("Invalid Number");
		        return;
		}
		System.out.print("Answer is : " + result);
		
	}
}
