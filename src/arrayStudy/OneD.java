package arrayStudy;

public class OneD {

	public static void main(String[] args) {
		int car[]= {1,2,3,4,5,6};
		
		for(int i=0;i<=car.length-1;i++)
		{
			System.out.print(car[i]+" ");
		}
		System.out.println();
		//reverse
		for(int i=car.length-1;i>=0;i--)
		{
			System.out.print(car[i]+" ");
		}

	}

}
