//Program to show the recursive call for main
//normal class to discpllay two variables a and b
class A{
	int a=10;
	int b=30;
	void display(){
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	A(){
		a = 20;
		b=30;
		
	}
	
	A(int x,int y){
		a = x;
		b = y;
		System.out.println("a "+a);
		System.out.println("b "+b);
		System.out.println("x "+x);
		System.out.println("y "+y);
		//System.out.println("y "+obj.y);
		System.out.println("this.a "+this);
		System.out.println("this.a "+this.a);
		System.out.println("this.b "+this.b);
		
		
		
	}

}

class Amain{
	public static void main(String args[]){
		//A obj;
		String a[] ={"Hello","World"}; // creating a string array to pass as agrument to main
		A obj = new A(40,50); // instantiating for class A 
		A obj1 = new A(60,70); // instantiating for class A 
		System.out.println("a "+obj.a);
		System.out.println("b "+obj.b);
		System.out.println("obj "+obj);
		System.out.println("obj "+obj1);
		
		/*Amain Am = new Amain(); // instantiating for class Amain
		obj.display();  // calling display method of class A
		Am.main(a); //recursice call?? whether it will loop or only once? 
		System.out.println(args[0]); // what is the value of args[0]*/
		
		
	}
}