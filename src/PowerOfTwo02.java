import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�¼�: ");
		int power = scanner.nextInt();
		int result = 1;
		int i = 0;
		
		while(i<power){
			result *= 2;
			i++;
		}
		System.out.println("2�� " + power + "�������� " + result + "�Դϴ�.");
		scanner.close();	//�ܺ��ڿ��� �̿�� �ݾ�����Ѵ�. (�ٸ� �ڿ��� ������ ���� ���� �߻�)
	}
}
