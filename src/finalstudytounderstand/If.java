package finalstudytounderstand;

public class If {

	public static void main(String[] args) {
	//if is used when only 1 condition is given
		//11111111111
		int a=49;
		
		if(a>20)//example 1-if
		{
		System.out.println("I am Pass");}
		
		
		//if else is used when 2 conditions are given and we have to compare
		//22222222222222
		char gender='M';
		if(gender=='F')
		{System.out.println("My gender is Female");}
	
		
		char grade='A';//example 2-if else
		
		if(grade=='A')
		{
			System.out.println("Then my marks are >90");
		}
		else
		{
			System.out.println("Then my marks are <90");
		}
          
		float temp=4.5f;//example 3-if else
		if(temp>40)
		{
			System.out.println("It is summer season");
		}
		else
		{System.out.println("It is winter season");}
		
		//else if- when multiple conditions are given
		
		String season= "aaaaaaaaa";
		if (season=="Summer")
			{System.out.println("Its very hot");}
		
		else if(season=="Rainy")
		{System.out.println("It is raining heavily");}
		
		else if(season=="Winter")
			{System.out.println("It is ver cold");}
		
		else
		{System.out.println("Invalid season");}
		
		//Switch- same as as if when multiple conditions are given
		//difference between switch and else if is that
		//switch directly goes to the condition that we want to execute
		//else if checks all conditions one by one
		
	{
	}

		}
		
	}


