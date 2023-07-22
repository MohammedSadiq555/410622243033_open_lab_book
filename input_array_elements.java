package open_lab_book;
import java.util.Scanner;
public class input_array_elements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int sum=0;
		System.out.println("Enter=");
		for(int i=0;i<10;i++) {
			array[i]=scanner.nextInt();
			
		}
		for(int n:array) {
			sum=sum+n;
		}
		System.out.println("sum"+sum);
	}

}
