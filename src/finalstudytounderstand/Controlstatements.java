package finalstudytounderstand;

public class Controlstatements {

	public static void main(String[] args) {

		int a=56; int b=9;  //1
		int c=(a+b);
		if(c>76)
		{System.out.println("I am an engineer.");}
		
		else
		{System.out.println("I am a Doctor.");} //2
		
		//else if
		/* If marks are >90, then it is distinction
		 * If marks are >75 and <=90, the I am second
		 * If marks are >60 and<=75, then I am third
		 * Else the result is fail*/
		int marks=7;
		if(marks>90)
		{
			System.out.println("I have distinction.");
		}
		else if(marks>75 & marks<=90)
		{ System.out.println("I am second.");}
		
		else if(marks>60& marks<=75)
		{System.out.println("I am third.");}
		
		else
		{System.out.println("I am fail.");}
		
		//Switch
		
		//if season is summer,winter,monsoon,else
	
		String season="Wint";
		switch(season)
		{
		case "Summer":System.out.println("It is too hot outside");
		break;
		
		case "Winter":System.out.println("It is very cold");
		break;
		
		case "Monsoon": System.out.println("It is raining heavily");
		break;
		
		default: System.out.println("Please enter valid data");
		
		}

		//Nested else if

	}

}
