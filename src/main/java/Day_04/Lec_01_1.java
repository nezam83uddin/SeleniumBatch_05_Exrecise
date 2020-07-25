package Day_04;

public class Lec_01_1 {

	public static void main(String[] args) {
		Exrecise_03();
	}

	public static void Exrecise_03() {
		/**
		 * Interview Questions Ans: Print 8
		 */
		int i = 0;
		boolean trace = false;
		for (i = 6; i < 12; i++) {
			
			if (i == 7) {
				trace=true;
				break;
			}
		}

		System.out.println(trace);
	}

	
	
	public static void Exrecise_02() {
		/**
		 * Interview Questions Ans: Print 8
		 */

		int i = 0;
		for (i = 6; i < 12; i++) {
			if (i == 8) {

				break;
			}
		}
		System.out.println(i);

	}

	public static void Exrecise_01() {
		/**
		 * Interview Questions Ans: Print 6 to 11
		 */

		for (int i = 6; i < 12; i++) {
			System.out.println(i);
		}

	}

}
