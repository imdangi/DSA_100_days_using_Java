import java.util.Scanner;

public class powerOfTwo {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter how many power of 2 you want : ");
		int exp=scanner.nextInt();
		long res=1;
		int i=0;
		while(i<exp) {
			res=res*2;
			i+=1;
		}
		System.out.println("Power of 2^"+exp+" = "+res);
		scanner.close();
		

	}

}
