class LogicGates{
//find hwo to pass variable length arguments  in java it is three dots
// ... example: func(int ... a)
int or_gate(int in1,int in2){
	
	int a,b;
	a=in1;
	b=in2;
	int ans;
	
    int or_ans; 
  
    // using the | operator 
    or_ans = a | b; 
	return or_ans;
}


int nor_gate(int in1,int in2){
	
	int nor_ans;
	int a=in1;
	int b=in2;
	//boolean x;
	if (a==0 && b==0) 
        nor_ans = 1; 
    else
        nor_ans = 0; 
	
	return nor_ans;	
}

public static void main(String args[]){
	int inp1=1;
	int inp2=1;
	LogicGates lg = new LogicGates();
	int result_or = lg.or_gate(inp1,inp2);
	int result_nor = lg.nor_gate(inp1,inp2);
	System.out.println("Result of or_gate :"+result_or);
	System.out.println("Result of nor_gate :"+result_nor);
	

}

}