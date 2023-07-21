package open_lab_book;
import java.util.Scanner;

public class Area_of_rectangle {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.out.print("length=");
		double leng=scann.nextDouble();
		System.out.print("width=");
		double width=scann.nextDouble();
		double area=leng*width;
		System.out.println("area="+area);
		}

}
