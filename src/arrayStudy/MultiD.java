package arrayStudy;

public class MultiD {

	public static void main(String[] args) {
		int roll[][]={{12,23,34,45},{33,44,55,66},{76,65,54,43}};
		for(int i=0;i<=2;i++)
		{for(int j=0;j<=3;j++)
			{System.out.print(roll[i][j]+" ");}
		System.out.println();}
		
		System.out.println("=======");
		
		for(int i=0;i<=2;i++)
		{for(int j=0;j<=i;j++)
			{System.out.print(roll[i][j]+" ");}
		System.out.println();}
		

	}

}
