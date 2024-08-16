package week1_assignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=19;

		for (int i = 2; i <=num-1; i++) {

			if (num%i==0) {
				System.out.println("Not a Prime Number");
			}
				else {
					System.out.println("it is Prime Number");
					break;
				}


			}

		}

	}


