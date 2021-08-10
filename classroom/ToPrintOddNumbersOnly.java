package week1.day2.classroom;

public class ToPrintOddNumbersOnly {
int i=12;
int w=22;
	public static void main(String[] args) {

	System.out.println("Odd numbers are:");
		for (int i = 0; i <= 10; i++) {

			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
