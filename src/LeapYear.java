
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year= 2016;
		
		if( year % 4 != 0){
			System.out.println("������ �ƴմϴ�.");
		}else if(year % 100 != 0){
			System.out.println("�����Դϴ�.");
		}else if(year % 400 == 0){
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("������ �ƴմϴ�.");
		}
	}

}
