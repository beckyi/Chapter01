
public class MonthDays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 5;
		int days = 0;
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8){
			days = 31;
		}else if(month == 2){
			days = 28;
		}else if(month == 4 || month == 6){
			days = 30;
		}else{
			days = 0;
		}
		System.out.println(month +"���� "+days+"�ϱ��� �ֽ��ϴ�.");
	}

}