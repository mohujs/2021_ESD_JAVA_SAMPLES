/* Program to Display odd numbers */

class DisplayOdd{
	public static void main(String args[]){
		int num=1;
		do{
			if(num % 2 !=0){
				System.out.println("The odd values: "+num);
			}
			++num;
		}while(num<=100);
	}
}