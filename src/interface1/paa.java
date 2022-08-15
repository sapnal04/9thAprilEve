package interface1;

public interface paa extends maa{
	
	void hello();
	void health();
	
	default void love()
	{System.out.println("paa love");}
	

}
