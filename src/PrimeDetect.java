import java.util.*;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("�Ҽ����� �Ǵ��� ����: ");
		//���� �ʱ�ȭ
		int divisor = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;
		//�Ǵ�
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
		//���
		if (isPrime=true) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
