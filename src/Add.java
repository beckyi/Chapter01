
public class Add {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(String arg : args){
			int value = Integer.parseInt(arg);
			sum += value;

		}
		System.out.println(sum);
	}
}
