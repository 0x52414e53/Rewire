import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int grades = 100;
                System.out.println("Your Grades: ");
                      grades = input.nextInt();
                        if(grades >=99){
                            System.out.println("With highest honors");
                                }else if(grades >= 96){
                                    System.out.println("With High Honor");
                                        }else if (grades >= 94){
                                            System.out.println("With Honor");
                                            }
                                            else{
                                                System.out.println("Bagsak ka");
                                                }
                                                input.close();
	}   
}
