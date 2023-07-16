package open_lab_book;

public class large_number {
	public static void main(String[] args) {
		double n1 = -5.5,n2 = 4.5,n3 = 5.5;
		if(n1>n2 || n1>n3) {
			System.out.println("n1 is big");
		} else if(n2>n1 || n2>n3) {
			System.out.println("n2 is big");
		}else {
			System.out.println("n3 is big");
		}
	}

}
