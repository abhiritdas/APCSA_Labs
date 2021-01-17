/* Name: Abhirit Das	
  Period: 3
  Lab/Project: FirstLastLab*/

public class FirstLast {

	public void calcResult(String string1, String string2) {
		
		char new1 = string1.charAt(0); 
		char new2 = string2.charAt(string2.length() -1);		
		String result = new1+""+new2;
		
		System.out.println("first and last of strings: " + result);
		
	}

}
