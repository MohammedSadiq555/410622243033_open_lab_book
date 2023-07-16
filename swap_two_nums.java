package open_lab_book;

public class swap_two_nums {
	public static void main(String[] args) {
		float first = 2.50f, second = 4.50f;
		System.out.println("before");
		System.out.println(first + " " + second);
		float num= first;
		first = second;
	second = num;
	System.out.println("after");
	System.out.println(first + " " + second);
				
	}

}

