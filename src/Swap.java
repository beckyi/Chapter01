
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 30;
		int temp;

		// Q1: n1���� �׻� ū ���� �ǵ���, �ʿ��� ��� n1�� n2�� ��ü�϶�.
		if(n1>=n2){
			//�״�� ���
		}else{
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		// Q2: �ִ밪�� �Ǻ��ϴ� ������ �ϼ��� ������.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		int max;	//�ִ밪 ����

		if (a1 >= a2) {
			if(a1>=a3){
				max = a1;
			}else{
				//a3 > a1 > a2
				max = a3;
			}
		}else {
			if(a2>=a3){
				max = a2;
			}else{
				//a3 > a2 > a1
				max = a3;
			}
		}
		System.out.println("max: " +max+" �Դϴ�.");
	}
}