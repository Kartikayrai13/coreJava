package Java8;

public class TestFunctional2 {
	public static void main(String[] args) {
		Functional2 f1=(a)->{
			/* for odd even 
			if(a% 2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			};
			f1.oddeven(2);						
};
*/
		/*	int  temp = 0;
			int i;
			for (i = 2; i < a; i++) {
				if (a % i == 0) {
					temp++;
					break;
				}
			}
			if (temp == 0) {
				System.out.println("Number is a prime number.");
			} else {
				System.out.println("Number is not a prime number.");
			}
	};
	f1.prime(12);
	}*/
			
			int r;
			int sum = 0;
			int n = a;
			while (n > 0) {
				r = n % 10;
				sum = sum * 10 + r;
				n = n / 10;
			}
			if (sum == a) {
				System.out.println("Number is a Palindrome number:" + sum);
			} else {
				System.out.println("Number is not a Palindrome number:" + sum);
			}
};
			f1.palindrome(345);
	}
}

