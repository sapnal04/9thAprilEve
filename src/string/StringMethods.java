package string;

public class StringMethods {

	public static void main(String[] args) {
		String a="Sapna Lohani";
		String b=new String("i love my India");
		String d=" ";
		//String c=null; //null means nothing-so kuch hai hi nahi to length kiski btayega
		//1
		System.out.println(a.length());
		//System.out.println(c.length());
		//2-3
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		//4-5
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		//6-7
		System.out.println(a.startsWith("Sa"));
		System.out.println(b.startsWith("I")); //case sensitive
		System.out.println(a.endsWith("ani"));
		//8-9
		System.out.println(d.isEmpty());
		System.out.println(d.isBlank());
		//10
		System.out.println(b.contains("e my"));
		//11
		System.out.println(a.concat(". "+b));
		//12
		System.out.println(a.substring(0,4));
		//13-14
		System.out.println(a.indexOf("L"));
		System.out.println(b.indexOf("i", 4));
		System.out.println(b.lastIndexOf("i"));
		System.out.println(b.lastIndexOf("i",7));
		//15
		System.out.println(a.replace("Sap", "kshi"));
		//16
		System.out.println(a.charAt(4));
		//17 split
		String name="Hello My name is Mr burgur";
        String names[]=name.split(" ");
        for(int i=0;i<=5;i++)
        {System.out.print(names[i]+"//");}

	}

}
