class SwapWithoutThirdVariable{
	public static void main(String args[]){
	
		int num1=10;
		int num2=20;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("The num1 value: "+num1);
		System.out.println("The num2 value: "+num2);
	
		
	}
}