import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("승수: ");
		int power = scanner.nextInt();
		int result = 1;
		int i = 0;
		
		while(i<power){
			result *= 2;
			i++;
		}
		System.out.println("2의 " + power + "제곱근은 " + result + "입니다.");
		scanner.close();	//외부자원을 이용시 닫아줘야한다. (다른 자원에 영향이 미쳐 오류 발생)
	}
}
