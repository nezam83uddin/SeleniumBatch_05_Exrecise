package Day_02;

public class Lec_01_1_Exrecise_02 {

	
	public static void main(String[] args) {
		
		int num=1234;
		if (num<100 && num>=1) {
			System.out.println("Its a two digit number");
		}else if (num<1000 && num>=100) {
			System.out.println("Its a two digit number");
		}else if (num<10000 && num>=1000) {
			System.out.println("Its a two digit number");
		}else if (num<100000 && num>=10000) {
			System.out.println("Its a two digit number");
		}
		else {
			System.out.println("number is not between 1 & 99999");
		}
	}
}
