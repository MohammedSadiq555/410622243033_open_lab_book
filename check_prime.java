package open_lab_book;
import java.util.Scanner;

public class check_prime {
	public static void main(String[] args) {
		int temp;
		boolean isp=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isp=false;
				break;
			}
		}
	
	if(isp) System.out.println(num+"is a prime number");
	else System.out.println(num+"is not a prime number");
	}
	}


