class ARMStrongNumber{
	public static void main(String args[]){
		int input=,sum=0, temp, remainder;
		temp=input;
		while(temp !=0 ){
			remainder = temp%10;
			sum = sum + remainder * remainder * remainder;
			temp = temp / 10;
		}
		if(input == sum){
			System.out.println("Input number is ARMString Number");
				
		}
		else{
			System.out.println("Input number is not ARMString Number");
			
		}
	}
}