package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] a = {10, 20, 30, 40, 50}; // '{(insert)} denotes a set of values
	
	System.out.println(a[0] + " " + a[1]);
	
	//enhanced for statement
	for(int temp : a){ // temp is an arbitrary variable
		System.out.println(temp);
		break;
	}
    int[] x = new int[5];
    
    x[3] = 25;
    x[0] = 12;
    
    for(int temp2 : x){
    	System.out.println(temp2); 
    }
    
	}
	
}