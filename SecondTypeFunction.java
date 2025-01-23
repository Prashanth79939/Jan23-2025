package day3;

public class SecondTypeFunction {
	static void pattern(char ch1,int num1,char ch2,int num2) {
		for(int i=1;i<=num1;i++) 
		{
			System.out.print(ch1);
		}
		System.out.println();
		for(int i=1;i<=num2;i++) {
			System.out.print(ch2);
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		pattern('*',20,'-',25);
		System.out.println("wellcome");
		pattern('.',25,'-',35);
		System.out.println("hyderabad");
	
	
		
	}}