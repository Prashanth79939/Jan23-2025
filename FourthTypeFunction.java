package day3;

public class FourthTypeFunction {
	static float anyIndiaRupee(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("usa")) {
			res=amt*80.5f;
			return res;
		}
		else if(country.equalsIgnoreCase("uk")) {
			res=amt*30*5f;
		}
		else if(country.equalsIgnoreCase("UAE")) {
			res=amt*20.56f;
		}
		return res;
	}
	static int getAmt() {
		return 100;
	}
	public static void main(String[] args) {
		int ukPounds=200,uaeDirams=50;
		float rupees=anyIndiaRupee("USA",getAmt());
		System.out.println("indian rupees---.USA  "+rupees);
		rupees=anyIndiaRupee("UK",ukPounds);
		System.out.println("indian rupees---for UK  "+rupees);
		rupees=anyIndiaRupee("UAE",uaeDirams);
		System.out.println("indian rupees---.for UAE "+rupees);
	}
}
