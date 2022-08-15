package finalstudytounderstand;

public class SwitchStudy {

	public static void main(String[] args) 
	{
		String day= "Saturday";
		
		switch(day)
		{
		case "Monday": System.out.println("If the day is Monday");
		break;
		
		case "Tuesday":System.out.println("If the day is Tuesday");
		break;
		
		case "Wednesday": System.out.println("If the day is Wednesday");
		break;
		
		case "Thursday": System.out.println("If the day is Thursday");
		break;
		
		case "Friday": System.out.println("If the day is Friday");
		break;
		
		case "Saturday": System.out.println("If the day is Saturday");
		break;
		
		case "Sunday": System.out.println("If the day is Sunday");
		break;
		
		default: System.out.println("Please enter a valid day of the week");
		}

	}

}
