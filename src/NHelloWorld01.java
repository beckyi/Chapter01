import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "Hello World";
		//String s = new String("Hello World");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		int i = 0;
		while(i<count){
			System.out.println("Hello World");
			i = i + 1;
		}
	}

}
