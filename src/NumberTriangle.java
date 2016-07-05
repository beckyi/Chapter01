import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형 높이 : ");
		int cnt = scanner.nextInt();
		
		for (int i=1;i<=cnt;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println("");
		}
		scanner.close();
	}
}

