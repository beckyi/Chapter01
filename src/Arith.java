
public class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 3;

		System.out.println(a+b);	//10
		System.out.println(a-b);	//4
		System.out.println(a*b);	//21
		System.out.println(a/b);	//2
		System.out.println(a%b);	//1
		System.out.println(-a);		//-7
		System.out.println(++a);	//8 -> ���� : �� ���� ���� / ���� ���� (�����ϰ� ���)
		//a = a + 1;
		//System.out.println(a);
		System.out.println(a++);	//8 -> ����: ���� ���� ���� / �� ���� (����ϰ� ����)
		//System.out.println(a);
		//a = a + 1;
		System.out.println(--b);	//2
		//b = b - 1;
		//System.out.println(b);
		System.out.println(b--);	//2
		//System.out.println(b);
		//b = b - 1;
		
		System.out.println( 10/3 );	//3
		System.out.println( 10.0/3 );	//3.3333333333333335
		System.out.println( 10/(double)3);	//3.3333333333333335
		System.out.println((double)(10/3));	//3.0
		
		System.out.println(-7%3);	//-1
		System.out.println(7%-3);	//1
	}

}
