
public class StringsNotesMain {

	public static void main(String[] args) {
		
	String string1 = "JordanHS";
	String string2 = new String("Warriors"); //same thing; logic of how it is an object

	System.out.println("String 1 is " + string1.length() +" characters long.");
	//length = # of characters, final index = length - 1

	String string3 = "Hello";
	System.out.println("String 3 is " + string3.length() + " characters long.");
	System.out.println(string3.charAt(0)); //H
	System.out.println(string3.charAt(4)); //o

	System.out.println(string1.substring(0,7)); //jordan string


	}

}
