package open_lab_book;
import java.util.Scanner;

public class multiply_Two_numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of i...");
		int i=scan.nextInt();
		System.out.println("Enter the value of j...");
		int j=scan.nextInt();
		int mul=i*j;
		System.out.println("The answer is" + mul);
	}
	

}
