
public class Typecast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 25;	//-127~128
		short s = b;
		int i = s;
		long l = i;
		float f = i; // i의 주소를 가리킴으로 f를 붙일 필요 X
		double d = f;

		byte b1 = (byte)128;	//int로 인식 (int가 더 크다?)
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b1 = " + b1);

	}

}
