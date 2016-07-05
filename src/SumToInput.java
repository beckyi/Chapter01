import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("ют╥б > ");
		int number = scanner.nextInt();
		int sum = 0;
		
		for(int i=1;i<=number;i++){
			sum=sum+i;
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
