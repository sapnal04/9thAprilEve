package generalization;

public class Airtel implements TRE {

	@Override
	public void sms() {
		System.out.println("150 sms/day");
		
	}

	@Override
	public void call() {
		System.out.println("20p/30 seconds");}
		
		public void data()
		{
			System.out.println("1GB/day");
		}
		

}
