package open_lab_book;
import java.util.Scanner;
public class area_of_circle {
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.out.print("radius=");
		double rad=scann.nextDouble();
		double pi=3.14;
		double area=rad*rad*pi;
		System.out.print(area);
	}

}
