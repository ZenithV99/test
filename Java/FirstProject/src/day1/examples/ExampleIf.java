package day1.examples;

public class ExampleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 20;
double y = 20.1;
if(x < y){ // If x is greater than y
	System.out.println("X is less than Y");
}else if(x == y){ // If x does not satisfy the first possibility, ELSE extends the first IF possibility(when the first is false, of course), to match the second
	System.out.println("X is equal to Y");
}else{ // If x does not equal the first two possibilities, extend IF using ELSE to match the third
	System.out.println("X is greater than Y");
}
	}

}
