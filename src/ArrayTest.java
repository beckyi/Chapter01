
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = new char[3];	//char c[];
		c[0] = 'S';
		c[1] = 'K';
		c[2] = 'U';
		
		int[] scores = {100, 90, 20, 30, 40};
		int sum=0;
		for(int i=0; i<scores.length; i++){
			sum = sum + scores[i];
		}
		int sum2=0;
		for(int score:scores){	//scores 배열 내 값을 하나씩  뱐수  score에 저장
			sum2 +=score;
		}
		System.out.println(sum + " , " + sum2);
	}
}
