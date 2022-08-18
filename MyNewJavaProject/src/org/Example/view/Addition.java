package org.Example.view;

public class Addition {
	//Define a property/attribute- variable 
	//create a variable 
	//<data-type> <identifier>--primitive variable 
	int number1=90;
	int number2=5;
	int result=0;
	int num1,num2;//declaration statement 
	
	//defined behavior -method //concrete method //non static method 
	void sum() {
		result=number1+number2;
		System.out.println(result);
		System.out.println("the result:"+result);
		
	}
	void display() {   //concrete method //non static method 
		int num1;  //Declaring local variable which of primitive type int 
		 num1= 10; //initialization 
		
		int value=20;  //declaration and initialization is done in single statement
	    System.out.println("Display method"+ result);
	}
	 static void print() { //static method //brackets are called as parameters 
		 System.out.println("static print method  ");
		
	}
    public static void main(String arg[]) { //static method //parameter which is of string type 
    	System.out.println("main method ");
    	
    	//to call a non static method from static method object is required and 
    	//to call static method from a static method call is directly  
    	print(); //calling //brackets //argument //empty arg
    	System.out.println("main method ");
    	Addition additionobj=new Addition();
    	additionobj.display();
    	additionobj.sum();
    	additionobj.display();
    }
}
