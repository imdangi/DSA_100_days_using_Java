import java.util.Scanner;

public class japeneseDoll {
	
	
	static String isRecursion(int num) {
		
		if (num==1) {
			return("All dolls are opened : "+num);
		}
		else {
			System.out.println("No. of dolls : "+num);
			return (isRecursion(num-1));
		}
	}

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of dolls");
		int num=scanner.nextInt();
		System.out.println(japeneseDoll.isRecursion(num));
		
		scanner.close();

	}

}
