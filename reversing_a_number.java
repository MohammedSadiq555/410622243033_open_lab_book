package open_lab_book;
import java.util.Scanner;
public class reversing_a_number {
	public static void main(String[] args) {
	int num=0;
	int reversenum = 0;
	System.out.println("Enter your number:");
	Scanner in=new Scanner(System.in);
	num = in.nextInt();
	while(num!=0) {
		reversenum=reversenum*10;
		reversenum = reversenum + num%10;
		num = num/10;
	}
	System.out.println("The reverse num is"+reversenum);
	
	}

}
