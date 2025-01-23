package day3;

public class ThirdTypeFunction {
	int maxDigit() {
		return 9;
	}
	boolean indianMustHaveAadhar() {
		return true;
	}
	static float usDollar() {
		float rupees=78.67f;
		return rupees;
	}
	char appleFistchar() {
		return 'A';
	}
	String indiaCapital() {
		return"Delhi";
	}
	public static void main(String[] args) {
		float indToUsDollar=usDollar();

		System.out.println("india ruppes of us dollar--->"+indToUsDollar);
	}
}
