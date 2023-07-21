package open_lab_book;
import java.util.Scanner;

public class Area_of_tri {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.out.print("width=");
		double wid=scann.nextDouble();
		System.out.print("height=");
		double hei=scann.nextDouble();
		double area=(wid*hei)/2;
		System.out.print(area);
		
	}

}
