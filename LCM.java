
class LCM{
	public static void main(String args[]){
	//LCM is smallest positive number that is divisible by both the numbers
		int num1=30;
		int num2=20;
		int lcm=0;
		
		lcm=(num1>num2) ? num1 : num2;
		
		while(true){
			if(lcm % num1 == 0 && lcm % num2 ==0){
				System.out.println(lcm);
				break;
			}
			++lcm;
		
		}
	
	}

}