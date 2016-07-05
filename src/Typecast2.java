
public class Typecast2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i = 414;
		float f = 123.456f;	// float 선언 시 f를 붙여줘야함?
		
		b=(byte)i;	//큰거에서 작은걸로 형변환 int->byte
		System.out.println("int 414를 byte로 변환 : " + b);
		i=(int)f;
		System.out.println("float 123.456을 int로 변환: " + i);
		b=(byte)f;
		System.out.println(" float 123.456을 byte로 변환: " + b);

	}
}
