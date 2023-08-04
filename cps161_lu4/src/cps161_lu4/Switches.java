package cps161_lu4;

public class Switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 1;
		String month_name;
		int numb_days;
		
			switch (month) 
			{
		    case 1: 
		        month_name = "January";
		        break;
		    case 2:
		        month_name = "February";
		        break;
		    case 3: 
		        month_name = "March";
		        break;
		    case 4: 
		        month_name = "April";
		        break;
		    case 5: 
		        month_name = "May";
		        break;
		    case 6: 
		        month_name = "June";
		        break;
		    case 7:
		        month_name = "July";
		        break;
		    case 8:
		        month_name = "August";
		        break;
		    case 9:
		        month_name = "September";
		        break;
		    case 10:
		        month_name = "October";
		        break;
		    case 11:
		        month_name = "November";
		        break;
		    case 12:
		        month_name = "December";
		        break;
		    default:
		        month_name = "Invalid month";
		        break;
		}
			
		/*	switch (month) 
			{
			case 1, 3, 5, 7, 8, 10 ,12:
				numb_days = 31;
			break;
			case 4, 6, 9, 11:
				numb_days = 30;
			break;
			case 2:
				numb_days = 28;
			break;
			default:
				numb_days = 0;
			break;
			} 
			
		*/
			
			numb_days = switch (month) 
			{
			case 1, 3, 5, 7, 8, 10 ,12 -> {
				System.out.println("longer month");
				yield 31;
			}		
			case 4, 6, 9, 11 -> 30;
			case 2 -> 28;
			default -> 0;
			};
			
			System.out.println(month_name + " " + numb_days);
	}

}
