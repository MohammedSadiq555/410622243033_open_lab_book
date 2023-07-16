package open_lab_book;
import java.util.Scanner;
public class even_odd {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("enter the number");
		int num=reader.nextInt();
		if(num%2==0) System.out.println("even");
		else System.out.println("odd");
	}

}
