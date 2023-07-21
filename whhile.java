package open_lab_book;
import java.util.Scanner;

public class whhile {
	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value under 10");
		number = sc.nextInt();
		while (number<=10) {
			sum=sum+number;
			number++;
		}
		System.out.format("sum of the numbers is: %d",sum);
	}

}
