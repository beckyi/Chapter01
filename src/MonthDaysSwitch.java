
public class MonthDaysSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 5;
		int days = -1;
		
		switch(month){
		case 1:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
		case 3:
			days = 31;
			break;
		case 4:
			days = 30;
			break;
		case 5:
			days = 31;
			break;
		case 6:
			days = 30;
			break;
		case 7:
			days = 31;
			break;
		case 8:
			days = 31;
			break;
		default:
			days = 0;
			break;
		}
		
		System.out.println(month +"월은 "+days+"일까지 있습니다.");
	}

}
