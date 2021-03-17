class SumOfDigits{
	public static void main(String args[]){
		int input=1221,sum=0, temp, remainder;
		temp=input;
		while(temp !=0 ){
			remainder = temp%10;
			System.out.println(remainder);
			sum = sum+remainder;
			System.out.println(sum);
			temp = temp/10;
		}
		
		System.out.println("Sum is"+sum);
				
	}
}