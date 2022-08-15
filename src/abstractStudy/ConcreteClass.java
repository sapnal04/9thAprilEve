package abstractStudy;

public class ConcreteClass extends AbstractClass {

	public static void main(String[] args) {
		
		ConcreteClass c=new ConcreteClass();

		c.cheeku();
		c.meeku();
		c.teeku();
	}

	@Override
	public void cheeku() {
		System.out.println("cheeku");
		
	}

	@Override
	public void meeku() {
		System.out.println("meeku");
		
	}

}
