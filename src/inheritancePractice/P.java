package inheritancePractice;

public class P {
	
		// Declare an instance variable. 
		    int a = 30; 



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an object of class Q and call the instance variable using reference variable q. 
		   Q q = new Q();
		   System.out.println(" Value of a: " +q.a); // 'a' of Q is called. 

}
	}

	 class Q extends P 
	{ 
	// Declare an instance variable whose name is same as that of the superclass instance variable name. 
	    int a = 50; 
	 } 