import java.util.*;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");
		//변수 초기화
		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		//판단
		while(divisor<num){
			if(num%divisor == 0){
				if(num==divisor){
					isPrime= true;
					break;
				}else{
					isPrime = false;
					break;
				}
			}else{
				isPrime = false;
				divisor = divisor+1;
			}
		}
		//출력
		if (isPrime=true) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
	}
}
